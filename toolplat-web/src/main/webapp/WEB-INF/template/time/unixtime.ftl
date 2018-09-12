<!DOCTYPE html>
<html>
<head>
  	<title>Unix时间戳(Unix timestamp)转换工具</title>
  	<meta name="keywords" content="Unix时间戳转换,时间戳转换" />
  	<meta name="description" content="Unix时间戳转换可以把Unix时间转成北京时间。" />
	
  	<#import "/common/common.macro.ftl" as netCommon>
	<@netCommon.commonStyle />
</head>
<!--
<body class="hold-transition skin-blue sidebar-mini <#if cookieMap?exists && "off" == cookieMap["adminlte_settings"].value >sidebar-collapse</#if> ">
-->
<body class="hold-transition skin-blue sidebar-mini sidebar-collapse">

<div class="wrapper" style="font-size: large;">
	<!-- header -->
	<@netCommon.commonHeader />
	<!-- left -->
	<@netCommon.commonLeft />
	
	<!-- Content Wrapper. Contains page content -->
	<div class="content-wrapper">
		<!-- Content Header (Page header) -->
		<section class="content-header">
			
			<h1>Unix时间戳转换<small>常用工具</small></h1>
			<!---->
			<ol class="breadcrumb">
				<li><a><i class="fa fa-dashboard"></i>常用工具</a></li>
				<li class="active">Unix时间戳转换</li>
			</ol>
			
		</section>

		<!-- Main content -->
		<section class="content">
		
		<center>
			
			<div class="easyui-layout" style="width:930px;height:560px; border: 1px rgb(202, 196, 196) solid;
			border-radius: 5px;">
			
				<div class="clearfix miao w80-0" style=" margin:0 auto;">
					<style>
						.pusmall .miao.w80-0 {
							width: 87%;
						}
					</style>
					<div class=" Iew5 UnTimeW clearfix mb20" style=" overflow:visible;margin-bottom:40px;">
						<div class=" clearfix ml20">
							<div class="PosTxt clearfix">
								<label class="YaHei fz14 col-blue02">时间戳（Unix timestamp）</label>
								<input type="text" name="timestamp" id="unixt" tabindex="1" class="InputTxt w140" size="30" value="">
								<div class="fl lh30 plr5 pr15">
									<div class="MainCate-choese _ToolChoese MainCateW-cont"> 
										<select id="unixtoutc8sel">
										  <option value="MS">毫秒</option>
										  <option value="S">秒</option>
										</select>
									</div>
								</div>
								<input type="button" value="转换成北京时间" id="unixtoutc8" tabindex="2" class="InputBtnC col-blue02 plr10 mr20">
								<input type="text" name="unixtoutc8result" id="unixtoutc8result" size="30" class="InputTxt w140" readonly="" value="">
							</div>
						</div>
					</div>
			
					<div class=" Iew5 UnTimeW clearfix mb20" style=" overflow:visible;margin-bottom:40px;">
						<div class=" clearfix ml20">
							<div class="PosTxt clearfix">
								<label class="YaHei fz14 col-blue02">yyyy-MM-dd HH:mm:ss.S</label>
								<input type="text" name="utc8" id="utc8" tabindex="1" class="InputTxt w140 mr20" size="30" value="">
								<input type="button" value="转换成Unix时间戳" id="utc8tounix1" tabindex="2" class="InputBtnC col-blue02 plr5 mr20  ml10">
								<input type="text" name="unixtoutc8result1" id="unixtoutc8result1" size="30" class="InputTxt w140" readonly="" value="">
								<div class="fl lh30 pl5">
									<div class="MainCate-choese _ToolChoese MainCateW-cont"> 
										<select id="utc8tounix1sel">
										  <option value="MS">毫秒</option>
										  <option value="S">秒</option>
										</select>
									</div>
								</div>
							</div>
						</div>
					</div>
			
					<div class=" Iew6 UnTimeW clearfix mb20" style=" overflow:visible">
						<div class="clearfix ml20">
							<div class="ReveTxt clearfix">
								<label class="YaHei fz14 col-blue02">北京时间</label>
								<input type="text" class="InputTxt w50" size="2" tabindex="3" name="year" id="year" maxlength="4" value="">
								<label>年</label>
								<input type="text" class="InputTxt w30" size="1" tabindex="4" name="month" id="month" maxlength="2" value="">
								<label>月</label>
								<input type="text" class="InputTxt w30" size="1" tabindex="5" name="day" id="day" maxlength="2" value="">
								<label>日</label>
								<input type="text" class="InputTxt w30" size="1" tabindex="6" name="hour" id="hour" maxlength="2" value="">
								<label>时</label>
								<input type="text" class="InputTxt w30" size="1" tabindex="7" name="minute" id="minute" maxlength="2" value="">
								<label>分</label>
								<input type="text" class="InputTxt w30" size="1" tabindex="8" name="second" id="second" maxlength="2" value="">
								<label>秒</label>
								<input type="button" value="转换Unix时间戳" id="utc8tounix" tabindex="9" class="InputBtnC col-blue02 plr10 mr20">
								<input type="text" name="utc8tounixresult" id="utc8tounixresult" class="InputTxt w120 fl" size="25" readonly="" value="">
								<div class="fl lh30 pl5">
									<div class="MainCate-choese _ToolChoese MainCateW-cont"> 
										<select id="utc8tounixsel">
										  <option value="MS">毫秒</option>
										  <option value="S">秒</option>
										</select>
									</div>
								</div>
							</div>
						</div>
					</div>
			
				</div>
			
			</div>
		</center>
			
		</section>
		<!-- /.content -->
	</div>
	<!-- /.content-wrapper -->
	
	<!-- footer -->
	<@netCommon.commonFooter />
</div>
<@netCommon.commonScript />
</body>

	<!-- style -->
	<link rel="stylesheet" href="${request.contextPath}/static/time/toolstyle.css">
   
   
<script type="text/javascript">


// 对Date的扩展，将 Date 转化为指定格式的String   
// 月(M)、日(d)、小时(h)、分(m)、秒(s)、季度(q) 可以用 1-2 个占位符，   
// 年(y)可以用 1-4 个占位符，毫秒(S)只能用 1 个占位符(是 1-3 位的数字)   
// 例子：   
// (new Date()).Format("yyyy-MM-dd hh:mm:ss.S") ==> 2006-07-02 08:09:04.423   
// (new Date()).Format("yyyy-M-d h:m:s.S")      ==> 2006-7-2 8:9:4.18   
Date.prototype.format = function(fmt)   
{ //author: meizz   
  var o = {   
    "M+" : this.getMonth()+1,                 //月份   
    "d+" : this.getDate(),                    //日   
    "h+" : this.getHours(),                   //小时   
    "m+" : this.getMinutes(),                 //分   
    "s+" : this.getSeconds(),                 //秒   
    "q+" : Math.floor((this.getMonth()+3)/3), //季度   
    "S"  : this.getMilliseconds()             //毫秒   
  };   
  if(/(y+)/.test(fmt))   
    fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length));   
  for(var k in o)   
    if(new RegExp("("+ k +")").test(fmt))   
  fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));   
  return fmt;   
}


$("#unixtoutc8").click(function(){
  var unixt = $("#unixt").val();
  if(unixt.length>0){
  	console.log("Unix TimeStamp-->" + unixt);
  	var optionVal = $("#unixtoutc8sel").val();
  	console.log("option val -->" + optionVal);
  	if("MS" == optionVal){
  		// 毫秒
  		var date = new Date(parseFloat(unixt));
  		console.log("date-->"+ date);
  		$("#unixtoutc8result").val(date.format("yyyy-MM-dd hh:mm:ss.S"));
  	}else{
  		// 秒
  		var date = new Date(parseFloat(unixt) * 1000);
  		$("#unixtoutc8result").val(date.format("yyyy-MM-dd hh:mm:ss"));
  	}
  }
});


$("#utc8tounix1").click(function(){
	var utc8 = $("#utc8").val();
  	if(utc8.length>0){
  		var date = new Date(utc8);
  		console.log("utc8-->" + utc8);
  		var optionVal = $("#utc8tounix1sel").val();
  		console.log("option val -->" + optionVal);
  		if("MS" == optionVal){
	  		// 毫秒
	  		$("#unixtoutc8result1").val(date.getTime());
	  	}else{
	  		// 秒
	  		$("#unixtoutc8result1").val(date.getTime() / 1000);
	  	}
  	}

});
	

$("#utc8tounix").click(function(){
	var utc8 = $("#year").val() + "-" + $("#month").val() + "-" + $("#day").val() + " " + $("#hour").val() + ":" + $("#minute").val() + ":" + $("#second").val();
	console.log("utc8-->" + utc8);
	var date = new Date(utc8);
  	console.log("utc8-->" + utc8);
  	var optionVal = $("#utc8tounixsel").val();
  	console.log("option val -->" + optionVal);
  	if("MS" == optionVal){
		// 毫秒
		$("#utc8tounixresult").val(date.getTime());
	}else{
		// 秒
		$("#utc8tounixresult").val(date.getTime() / 1000);
	}
});
	
</script>   
   
</html>
