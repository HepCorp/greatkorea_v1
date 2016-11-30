$(function(){
	//nav click, wheel scroll start
	var winHeight = $(window).height() - 140;

	$('a[href^="#"]').on('click', function(e){
		e.preventDefault();

		var target = this.hash, $target = $(target);

		$('html,body').stop().animate({
			'scrollTop':$target.offset().top - 140
		}, function(){
			window.location.hash = '1' + target;
		});
	});
	
	$(".category").each(function(index){
		$(this).attr("data-h",index * winHeight);
	});

	$(".category").bind("mousewheel",function(e){
		var st = parseInt($(this).attr("data-h"));
		if(e.originalEvent.wheelDelta >= 0) {
			$("body,html").stop().animate({scrollTop:st-winHeight});
			return false;
		}
		if(e.originalEvent.wheelDelta < 0) {
			$("body,html").stop().animate({scrollTop:st+winHeight});
			return false;
		}				
	});
	//nav click, wheel scroll end
	
	//introduction slide start
	
	var selNum = 0;
	var duration = 1000;
	var total = $("#introductionCon #hepBox>div").length;
	var isDir = "next";
	var timer
	var depth = 2;
	
	$("#hepBox #indicator a").not(".play, .stop").on("click",function(e){
		selNum = $(this).index();
		depth = depth+1;
		$("#introductionCon #hepBox>div").eq(selNum).css({display:block});
		$("#introductionCon #hepBox>div").eq(selNum).stop().animate({display:none},duration);
		indicator(selNum);
		return false;
	});
	
	$("#introductionCon #hepBox .prev").on("click",function(e){
		isDir = "prev";
		selNum = selNum-1;
		selNum = selNum%total;
		depth = depth+1;
		$("#introductionCon #hepBox>div").eq(selNum).css({display:block,opacity:0});
		$("#introductionCon #hepBox>div").eq(selNum).stop().animate({opacity:1}, duration);
		indicator(selNum);
		return false;
	});
	
	$("#introductionCon #hepBox .next").on("click",function(e){
		isDir = "next";
		selNum = selNum+1;
		selNum = selNum%total;
		depth = depth+1;
		$("#introductionCon #hepBox>div").eq(selNum).css({display:block,opacity:0});
		$("#introductionCon #hepBox>div").eq(selNum).stop().animate({opacity:1}, duration);
		indicator(selNum);
		return false;
	});
	
	
	function indicator(num) {
		alert(num);
		$("#introductionCon #indicator a").not(".play, .stop").removeClass("on");
		$("#introductionCon #indicator a").not(".play, .stop").eq(num).addClass("on");
	}
	function moveSlide() {
		
	}
	
	function auto(){
		if(isDir=="prev"){
			$("#introductionCon #hepBox .prev").trigger("click");
		}else{
			$("#introductionCon #hepBox .next").trigger("click");
		}
	}
	
	$("#introductionCon .play").on("click",function(e){
		timer = setInterval(auto, 3000);
		return false;
	});
	
	$("#introductionCon .stop").on("click",function(e){
		clearInterval(timer);
		return false;
	});
	
	//introduction slide end
	
	

});
