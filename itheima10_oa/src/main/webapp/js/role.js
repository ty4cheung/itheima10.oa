var role = {	
	data:{
		roleNode:null,
		zTreePlugin:null
	},
		
	roleTree : {
		setting : {
			isSimpleData: true,
			treeNodeKey: "rid",
			treeNodeParentKey: "pid",
			showLine: true,
			root:{ 
				isRoot:true,
				nodes:[]
			},
			callback:{
				rightClick:function(event, treeId, treeNode){
					role.data.roleNode = treeNode;
					role.showRMenu(event, treeId, treeNode);
				}
			}
		},
		/**
	     * 增加一个角色
	     */
	    addRole: function(){
	        /**
	         * 1、隐藏右键菜单
	         * 2、弹出一个框，输入角色的名字
	         */
	        $("#rMenu").hide();
	        var roleName = window.prompt("请输入角色的名称");
	        if (roleName) {//roleName有值
	            /**
	             * 在提交ajax请求之前，判断角色树上是否有相同的节点
	             */
	            if (!role.data.zTreePlugin.getNodeByParam("name", roleName)) {//树上没有该节点
	            	
	                /**
	                 * 发出ajax请求，在后台数据库中添加角色
	                 */
	                $.ajax({
	                    url: 'roleAction_addRole.action',
	                    data: {
	                        name: roleName,
	                        pid: role.data.roleNode.rid
	                    },
	                    type: 'POST',
	                    success: function(data){//后台添加成功，执行
	                        /**
	                         * 后台应该返回一个新的节点的id
	                         */
	                        var newNode = {
	                            rid: data.rid,
	                            name: roleName,
	                            pid: role.data.roleNode.rid
	                        };
	                        /**
	                         * 把新的节点追加到父节点上
	                         */
	                        role.data.zTreePlugin.addNodes(role.data.roleNode, newNode, true);
	                    }
	                });
	            }
	            else {
	                alert("该名称已经存在了");
	            }
	        }
	    },
	    /**
	     * 删除
	     */
	    deleteRole: function(){
	        /**
	         * 判断当前要删除的节点是否有子节点
	         */
	        if (!role.data.zTreePlugin.getNodeByParam("pid", role.data.roleNode.rid)) {//当前点击的节点没有子节点
	            if (window.confirm("您确认要删除吗?")) {
	                $.ajax({
	                    url: 'roleAction_deleteRole.action',
	                    data: {
	                        rid: role.data.roleNode.rid
	                    },
	                    success: function(){
	                        role.data.zTreePlugin.removeNode(role.data.roleNode);
	                    }
	                });
	            }
	        }
	        else {
	            alert("有子节点，不能删除");
	        }
	    },
	    /**
	     * 修改事件
	     */
	    updateRole: function(){
	        var rename = window.prompt("修改名字", role.data.roleNode.name);
	        if (!role.data.zTreePlugin.getNodeByParam("name", rename)) {//树上没有该节点
	            $.ajax({
	                url: 'roleAction_updateRole.action',
	                data: {
	                    rid: role.data.roleNode.rid,
	                    name:rename,
						pid:role.data.roleNode.pid
	                },
					type:'POST',
					success:function(){
						//因为是把某一个节点的属性修改了，所以刷新树
						role.data.roleNode.name = rename;
						role.data.zTreePlugin.refresh();
					}
	            });
	        }else{
				alert("该名字已经存在了");
			}
	    }
	},

	loadRoleTree:function(){
		$.ajax({
			url:'roleAction_showAllRole.action',
			data:null,
			success:function(data){
			role.data.zTreePlugin = $("#roleTree").zTree(role.roleTree.setting,data);
				
			}
		});
	},
	showRMenu:function(event, treeId, treeNode){
		var y = event.clientY;
		var x = event.clientX;
		$("#rMenu").show();	
		$("#rMenu").css({"top":y+"px","left":x+"px","display":"block"});
	},
	/*
     * 初始化的准备工作
     */
    init: {
        /**
         * 事件的初始化
         */
        initEvent: function(){
            $("#rMenu").hover(function(){//进入该区域应该做的事情
            }, function(){//离开该区域该做的事情
                $(this).hide();
            });
            
            /**
             * 给角色增加、删除、修改的右键菜单添加click事件
             */
            $("#addRole").unbind("click");
            $("#addRole").bind("click", function(){
                role.roleTree.addRole();
            });
            
            $("#updateRole").unbind("click");
            $("#updateRole").bind("click", function(){
                role.roleTree.updateRole();
            });
            
            $("#deleteRole").unbind("click");
            $("#deleteRole").bind("click", function(){
                role.roleTree.deleteRole();
            });
        }
    },

};

$().ready(function(){
	//加载角色树
	role.init.initEvent();
	role.loadRoleTree();
});
