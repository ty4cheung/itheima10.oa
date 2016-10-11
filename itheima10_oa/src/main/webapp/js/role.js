var role = {
	setting:{
		isSimpleData: true,
		treeNodeKey: "rid",
		treeNodeParentKey: "pid",
		showLine: true,
		root:{ 
			isRoot:true,
			nodes:[]
		}
	},
	loadRoleTree:function(){
		$.ajax({
			url:'roleAction_showAllRole.action',
			data:null,
			success:function(data){
				$("#roleTree").zTree(role.setting,data);
			}
		});
	}
};

$().ready(function(){
	//加载角色树
	role.loadRoleTree();
});
