/**
 * 
 */

$(function(){
	$(".access").click(function(){
		$("#access_terms").show();
		return false;
	});
	$(".access_close").click(function(){
		$("#access_terms").hide();
		return false;
	});
	$(".privacy").click(function(){
		$("#privacy_policy").show();
		return false;
	});
	$(".privacy_close").click(function(){
		$("#privacy_policy").hide();
		 return false;
	});
	
});