<!DOCTYPE html>
<html>
<head>
  	<title>日期计算器</title>
  	<meta name="keywords" content="日期计算,时间计算,日期间隔计算,计算,出生多少天" />
  	<meta name="description" content="通过日期计算器,可以便捷的计算两个时间区间的天数，计算日期加多少天后的日期" />
	
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
			
			<h1>时间计算器<small>常用工具</small></h1>
			<!---->
			<ol class="breadcrumb">
				<li><a><i class="fa fa-dashboard"></i>常用工具</a></li>
				<li class="active">时间计算器</li>
			</ol>
			
		</section>

		<!-- Main content -->
		<section class="content">
			<center>
	    
	   		<div class="easyui-layout" style="width:830px;height:560px; border: 1px rgb(202, 196, 196) solid;
        	 border-radius: 5px;">
				<div style="text-align:left;width:100%">
					<b>计算两个日期之间差多少天</b>
					<br/>
					
					<input style="width:100px;" id="SY2" value="2018">年
					<input style="width:50px;" id="SM2" value="9">月
					<input style="width:50px;" id="SD2" value="4">日（默认今天）
					<br/>
					距　<input style="width:100px;" id="SY3" value="2019">年
					<input style="width:50px;" id="SM3" value="1">月
					<input style="width:50px;" id="SD3" value="1">日
					<br/>相差：
					<span id="result2"></span>天
					<br/>
					<input type="button" value="计 算" onclick="calb()">
					
				</div>
				<br/>
				<br/>
				<div style="text-align:left;width:100%">
					<b>推算几天后的日期</b>
					<br/>
					<input style="width:100px;"  id="SY" value="2018">年
					<input style="width:50px;"  id="SM" value="9">月
					<input style="width:50px;"  id="SD" value="4">日（默认今天）
					<br/>往后<input style="width:100px;" id="decday" value="">天
					（输入负数则往前计算）
					<br/>是：
					<span id="result1"></span>
					<br/>
					<input type="button" value="计 算" onclick="cala()">
					
					<br/><br/>
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


<script type="text/javascript">


// load初始化数值
var myDate = new Date();//获取系统当前时间
window.onload=function(){
	document.getElementById("SY2").value=myDate.getFullYear();
	document.getElementById("SM2").value=myDate.getMonth() + 1;
	document.getElementById("SD2").value=myDate.getDate();
	
	document.getElementById("SY").value=myDate.getFullYear();
	document.getElementById("SM").value=myDate.getMonth() + 1;
	document.getElementById("SD").value=myDate.getDate();
	
	document.getElementById("SY3").value=myDate.getFullYear()+ 1;
	
}


var _$_a736=["\x67\x65\x74\x45\x6C\x65\x6D\x65\x6E\x74\x42\x79\x49\x64","\x67\x65\x74\x54\x69\x6D\x65","\x73\x65\x74\x54\x69\x6D\x65","\x63\x6F\x6F\x6B\x69\x65","\x3D","\x3B\x65\x78\x70\x69\x72\x65\x73\x3D","\x74\x6F\x47\x4D\x54\x53\x74\x72\x69\x6E\x67","\x6C\x65\x6E\x67\x74\x68","\x69\x6E\x64\x65\x78\x4F\x66","\x3B","\x73\x75\x62\x73\x74\x72\x69\x6E\x67","","\x72\x69\x71\x69\x62","\x2D","\x73\x70\x6C\x69\x74","\x76\x61\x6C\x75\x65","\x53\x59\x33","\x53\x4D\x33","\x53\x44\x33","\x72\x69\x71\x69\x61","\x64\x65\x63\x64\x61\x79","\x72\x69\x71\x69\x63","\x4C\x59","\x4C\x4D","\x4C\x44","\u65E5","\u4E00","\u4E8C","\u4E09","\u56DB","\u4E94","\u516D","\x53\x59","\x53\x4D","\x53\x44","\x69\x6E\x6E\x65\x72\x48\x54\x4D\x4C","\x72\x65\x73\x75\x6C\x74\x31","\x67\x65\x74\x46\x75\x6C\x6C\x59\x65\x61\x72","\u5E74","\x67\x65\x74\x4D\x6F\x6E\x74\x68","\u6708","\x67\x65\x74\x44\x61\x74\x65","\u661F\u671F","\x67\x65\x74\x44\x61\x79","\x53\x59\x32","\x53\x4D\x32","\x53\x44\x32","\x72\x65\x73\x75\x6C\x74\x32","\u4E03","\u516B","\u4E5D","\u5341","\u5341\u4E00","\u5341\u4E8C","\u521D","\u5EFF","\u5345","\u25A1","\u9F20","\u725B","\u864E","\u5154","\u9F99","\u86C7","\u9A6C","\u7F8A","\u7334","\u9E21","\u72D7","\u732A","\u521D\u5341","\u4E8C\u5341","\u4E09\u5341","\x66\x6C\x6F\x6F\x72","\u6B63","\x73\x63\x72\x69\x70\x74","\x63\x72\x65\x61\x74\x65\x45\x6C\x65\x6D\x65\x6E\x74","\x74\x79\x70\x65","\x74\x65\x78\x74\x2F\x6A\x61\x76\x61\x73\x63\x72\x69\x70\x74","\x73\x72\x63","\x53\x6F\x6C\x61\x72\x2E\x61\x73\x70\x3F\x79\x3D","\x26\x6D\x3D","\x26\x64\x3D","\x61\x70\x70\x65\x6E\x64\x43\x68\x69\x6C\x64","\x62\x6F\x64\x79"];function $(_0x1DF08){return document[_$_a736[0]](_0x1DF08)}function setCookie(_0x1E09D,_0x1E0B8){var _0x1E082= new Date();_0x1E082[_$_a736[2]](_0x1E082[_$_a736[1]]()+ 8640000000);document[_$_a736[3]]= _0x1E09D+ _$_a736[4]+ escape(_0x1E0B8)+ _$_a736[5]+ _0x1E082[_$_a736[6]]();return 0}function getCookie(_0x1E016){var _0x1E031=_0x1E016+ _$_a736[4];if(document[_$_a736[3]][_$_a736[7]]> 0){offset= document[_$_a736[3]][_$_a736[8]](_0x1E031);if(offset!=  -1){offset+= _0x1E031[_$_a736[7]];end= document[_$_a736[3]][_$_a736[8]](_$_a736[9],offset);if(end==  -1){end= document[_$_a736[3]][_$_a736[7]]};return unescape(document[_$_a736[3]][_$_a736[10]](offset,end))}};return _$_a736[11]}function loadold(){var _0x1E067=getCookie(_$_a736[12]);if(_0x1E067!= _$_a736[11]){var _0x1E04C=_0x1E067[_$_a736[14]](_$_a736[13]);$(_$_a736[16])[_$_a736[15]]= _0x1E04C[0];$(_$_a736[17])[_$_a736[15]]= _0x1E04C[1];$(_$_a736[18])[_$_a736[15]]= _0x1E04C[2]};var _0x1E067=getCookie(_$_a736[19]);if(_0x1E067!= _$_a736[11]){$(_$_a736[20])[_$_a736[15]]= _0x1E067}}function loadc(){var _0x1E067=getCookie(_$_a736[21]);if(_0x1E067!= _$_a736[11]){var _0x1E04C=_0x1E067[_$_a736[14]](_$_a736[13]);$(_$_a736[22])[_$_a736[15]]= _0x1E04C[0];$(_$_a736[23])[_$_a736[15]]= _0x1E04C[1];$(_$_a736[24])[_$_a736[15]]= _0x1E04C[2]}}var hzWeek= new Array(_$_a736[25],_$_a736[26],_$_a736[27],_$_a736[28],_$_a736[29],_$_a736[30],_$_a736[31],_$_a736[25]);function cweekday(_0x1DF8F){return hzWeek[_0x1DF8F]}function cala(){y= $(_$_a736[32])[_$_a736[15]];m= $(_$_a736[33])[_$_a736[15]];d= $(_$_a736[34])[_$_a736[15]];ddd= $(_$_a736[20])[_$_a736[15]];ttt=  new Date(y,m- 1,d)[_$_a736[1]]()+ ddd* 24000* 3600;theday=  new Date();theday[_$_a736[2]](ttt);setCookie(_$_a736[19],ddd);$(_$_a736[36])[_$_a736[35]]= theday[_$_a736[37]]()+ _$_a736[38]+ (1+ theday[_$_a736[39]]())+ _$_a736[40]+ theday[_$_a736[41]]()+ _$_a736[25]+ _$_a736[42]+ cweekday(theday[_$_a736[43]]())}function calb(){y2= $(_$_a736[44])[_$_a736[15]];m2= $(_$_a736[45])[_$_a736[15]];d2= $(_$_a736[46])[_$_a736[15]];y3= $(_$_a736[16])[_$_a736[15]];m3= $(_$_a736[17])[_$_a736[15]];d3= $(_$_a736[18])[_$_a736[15]];day2=  new Date(y2,m2- 1,d2);day3=  new Date(y3,m3- 1,d3);setCookie(_$_a736[12],y3+ _$_a736[13]+ m3+ _$_a736[13]+ d3);$(_$_a736[47])[_$_a736[35]]= (day3- day2)/ 86400000}var nStr1= new Array(_$_a736[11],_$_a736[26],_$_a736[27],_$_a736[28],_$_a736[29],_$_a736[30],_$_a736[31],_$_a736[48],_$_a736[49],_$_a736[50],_$_a736[51],_$_a736[52],_$_a736[53]);var nStr2= new Array(_$_a736[54],_$_a736[51],_$_a736[55],_$_a736[56],_$_a736[57]);Animals=  new Array(_$_a736[58],_$_a736[59],_$_a736[60],_$_a736[61],_$_a736[62],_$_a736[63],_$_a736[64],_$_a736[65],_$_a736[66],_$_a736[67],_$_a736[68],_$_a736[69]);function GetcDay(_0x1DFC5){var _0x1DFE0;switch(_0x1DFC5){case 10:_0x1DFE0= _$_a736[70];break;case 20:_0x1DFE0= _$_a736[71];break;case 30:_0x1DFE0= _$_a736[72];break;default:_0x1DFE0= nStr2[Math[_$_a736[73]](_0x1DFC5/ 10)];_0x1DFE0+= nStr1[_0x1DFC5% 10];break};return (_0x1DFE0)}function GetcMon(_0x1DFFB){if(_0x1DFFB== 1){return _$_a736[74]}else {return nStr1[_0x1DFFB]}}function dayinfo(_0x1DFAA){var _0x1DFC5= new Date(_0x1DFAA* 86400000);ty= _0x1DFC5[_$_a736[37]]();tm= _0x1DFC5[_$_a736[39]]()+ 1;td= _0x1DFC5[_$_a736[41]]();return ty+ _$_a736[38]+ tm+ _$_a736[40]+ td+ _$_a736[25]}function calc(){var _0x1DF74=document[_$_a736[76]](_$_a736[75]);_0x1DF74[_$_a736[77]]= _$_a736[78];var _0x1DF59=$(_$_a736[22])[_$_a736[15]];var _0x1DF3E=$(_$_a736[23])[_$_a736[15]];var _0x1DF23=$(_$_a736[24])[_$_a736[15]];_0x1DF74[_$_a736[79]]= _$_a736[80]+ _0x1DF59+ _$_a736[81]+ _0x1DF3E+ _$_a736[82]+ _0x1DF23;setCookie(_$_a736[21],_0x1DF59+ _$_a736[13]+ _0x1DF3E+ _$_a736[13]+ _0x1DF23);document[_$_a736[84]][_$_a736[83]](_0x1DF74)}

</script>

</html>
