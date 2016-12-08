$(function(){
	/* //nav click, wheel scroll */
	var winHeight = $(window).height() - 140;
	var selNum = 0;
	var duration = 1000;
	var total = $("#introductionCon #hepBox .slider").length;
	var listWidth = $("#introductionCon #hepBox .slider").width();
	var tx = listWidth;
	var rightEnd = listWidth*total;
	var isDir = "next";
	var timer
	var depth = 2;
	var slider = $(".sideSlide a");
	var h = new Array();
	var sum = 0;

	$('a[href^="#"]').on('click', function(e){
		e.preventDefault();

		var target = this.hash, $target = $(target);

		$('html,body').stop().animate({'scrollTop':$target.offset().top - 140}, function(){
			window.location.hash = target;
		});
	});

	/*$(".category").each(function(index){
		$(this).attr("data-h",index * winHeight);
	});

	$(".category").bind("mousewheel",function(e){
		var st = parseInt($(this).attr("data-h"));
		if(e.originalEvent.wheelDelta >= 0) {
			$("body,html").stop().animate({scrollTop:st-winHeight});
			$(".nav > dt").removeClass("active");
			$(".nav > dt").addClass("active");
			
		}
		if(e.originalEvent.wheelDelta < 0) {
			$("body,html").stop().animate({scrollTop:st+winHeight});
			$(".nav > dt").removeClass("active");
			$(".nav > dt").addClass("active");
			
		}
		return false;
	});*/
	
	/* //nav click, wheel scroll */
	
	/* sideSlide */
	
	slider.click(function(){
		var target = $(this).attr("href");
		
		$("html, body").animate({scrollTop:$(target).top},1000);
		if(slider.target){
			$(slider.target).removeClass("on");
			$(this).addClass("on");
		}else{
			$(this).addClass("on");
		}
		slider.target = this;
		return false;
	});
	slider[0].click();
	
	/*//sideSlide */

	/* topBtn */

	$(".topBtn").click(function(){
		$("html,body").animate({scrollTop:0});
		return false;
	});

	/*//topBtn */


	/* introduction slide */

	$("#hepBox #indicator a").on("click",function(e){
		selNum = $(this).index();
		depth = depth+1;
		indicator(selNum);
		moveSlide();
		return false;
	});

	$("#introductionCon #hepBox .prev").on("click",function(e){
		isDir = "prev";
		selNum = selNum-1;
		selNum = selNum%total;
		depth = depth+1;
		indicator(selNum);
		moveSlide();
		return false;
	});

	$("#introductionCon #hepBox .next").on("click",function(e){
		isDir = "next";
		selNum = selNum+1;
		selNum = selNum%total;
		depth = depth+1;
		indicator(selNum);
		moveSlide();
		return false;
	});

	//인디케이터 활성화
	function indicator(num) {
		$("#introductionCon #hepBox .slider").eq(num).css("display", "block");
		$("#introductionCon #hepBox .slider:not(:eq("+ num +"))").css("display", "none");

		$("#introductionCon #indicator .on").removeClass("on");
		$("#introductionCon #indicator a").eq(num).addClass("on");
	}

	function moveSlide() {

	}

	/*//introduction slide */
});
