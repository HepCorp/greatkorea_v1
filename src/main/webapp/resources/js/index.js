$(function(){
	/* //nav click, wheel scroll */
	
	var selNum = 0;
	var duration = 1000;
	var total = $("#introductionCon #hepBox .slider").length;
	var isDir = "next";
	var depth = 2;
	
	
	var h = new Array();
	var sum = 0;


	/**Editor : ysy */
	/**Date : 2016-12-12 */
	/* navigation */
	var winHeight = $(window).height() - 140;
	var slider = $(".sideSlide a");
	var nav = $(".nav dl dt a");
	var nav2 = $(".nav dl dd a");
	
	nav.add(nav2).add(slider).click(function(e){
		e.preventDefault();
		scrollNav(this);
		return false;
	});
	nav[0].click();
	
	$(".category").each(function(index){
		$(this).attr("data-h", index * winHeight);
	});
	$(".category").on("mousewheel DOMMouseScroll", function(e){
		var st = parseInt($(this).attr("data-h"));
		var wheel = $(document).scrollTop().valueOf();;
 		if (st >= wheel){
 			var id = $(".category").index(this);
 			activeMenu(id);
 		}
	});
	
	function scrollNav(obj){
		var target = obj.hash, $target = $(target);
		$("html, body").animate({scrollTop:$target.offset().top - 140}, 1000);
		
		var id = nav.index(obj);
		if (id == -1) id = nav2.index(obj);
		if (id == -1) id = slider.index(obj);
		activeMenu(id);
	}
	
	function activeMenu(id){
		nav.removeClass("active");
		nav.eq(id).addClass("active");
		slider.removeClass("on");
		slider.eq(id).addClass("on");
	}
	/* navigation end */

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
		return false;
	});

	$("#introductionCon #hepBox .prev").on("click",function(e){
		isDir = "prev";
		selNum = selNum-1;
		selNum = selNum%total;
		depth = depth+1;
		indicator(selNum);
		return false;
	});

	$("#introductionCon #hepBox .next").on("click",function(e){
		isDir = "next";
		selNum = selNum+1;
		selNum = selNum%total;
		depth = depth+1;
		indicator(selNum);
		return false;
	});

	//인디케이터 활성화
	function indicator(num) {
		$("#introductionCon #hepBox .slider").eq(num).css("display", "block");
		$("#introductionCon #hepBox .slider:not(:eq("+ num +"))").css("display", "none");

		$("#introductionCon #indicator .on").removeClass("on");
		$("#introductionCon #indicator a").eq(num).addClass("on");
	}
	/*//introduction slide */
	
});