
var projectName = '在线画展系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '作家作品',
	url: './pages/zuojiazuopin/list.html'
}, 
{
	name: '用户订单',
	url: './pages/yonghudingdan/list.html'
}, 
{
	name: '通知公告',
	url: './pages/tongzhigonggao/list.html'
}, 

{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssmz87jd/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"作家","menuJump":"列表","tableName":"zuojia"}],"menu":"作家管理"},{"child":[{"buttons":["查看","查看评论","删除"],"menu":"作家作品","menuJump":"列表","tableName":"zuojiazuopin"}],"menu":"作家作品管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"作品类型","menuJump":"列表","tableName":"zuopinleixing"}],"menu":"作品类型管理"},{"child":[{"buttons":["查看","删除"],"menu":"用户订单","menuJump":"列表","tableName":"yonghudingdan"}],"menu":"用户订单管理"},{"child":[{"buttons":["查看","删除"],"menu":"作家接单","menuJump":"列表","tableName":"zuojiajiedan"}],"menu":"作家接单管理"},{"child":[{"buttons":["查看","删除"],"menu":"订单信息","menuJump":"列表","tableName":"dingdanxinxi"}],"menu":"订单信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"通知公告","menuJump":"列表","tableName":"tongzhigonggao"}],"menu":"通知公告管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"作家作品列表","menuJump":"列表","tableName":"zuojiazuopin"}],"menu":"作家作品模块"},{"child":[{"buttons":["查看","作家接单"],"menu":"用户订单列表","menuJump":"列表","tableName":"yonghudingdan"}],"menu":"用户订单模块"},{"child":[{"buttons":["查看"],"menu":"通知公告列表","menuJump":"列表","tableName":"tongzhigonggao"}],"menu":"通知公告模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户订单","menuJump":"列表","tableName":"yonghudingdan"}],"menu":"用户订单管理"},{"child":[{"buttons":["查看"],"menu":"作家接单","menuJump":"列表","tableName":"zuojiajiedan"}],"menu":"作家接单管理"},{"child":[{"buttons":["查看","审核","支付"],"menu":"订单信息","menuJump":"列表","tableName":"dingdanxinxi"}],"menu":"订单信息管理"},{"child":[{"buttons":["查看","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"作家作品列表","menuJump":"列表","tableName":"zuojiazuopin"}],"menu":"作家作品模块"},{"child":[{"buttons":["查看","作家接单"],"menu":"用户订单列表","menuJump":"列表","tableName":"yonghudingdan"}],"menu":"用户订单模块"},{"child":[{"buttons":["查看"],"menu":"通知公告列表","menuJump":"列表","tableName":"tongzhigonggao"}],"menu":"通知公告模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"作家作品","menuJump":"列表","tableName":"zuojiazuopin"}],"menu":"作家作品管理"},{"child":[{"buttons":["查看","订单信息","删除"],"menu":"作家接单","menuJump":"列表","tableName":"zuojiajiedan"}],"menu":"作家接单管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"订单信息","menuJump":"列表","tableName":"dingdanxinxi"}],"menu":"订单信息管理"},{"child":[{"buttons":["查看","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"作家作品列表","menuJump":"列表","tableName":"zuojiazuopin"}],"menu":"作家作品模块"},{"child":[{"buttons":["查看","作家接单"],"menu":"用户订单列表","menuJump":"列表","tableName":"yonghudingdan"}],"menu":"用户订单模块"},{"child":[{"buttons":["查看"],"menu":"通知公告列表","menuJump":"列表","tableName":"tongzhigonggao"}],"menu":"通知公告模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"作家","tableName":"zuojia"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
