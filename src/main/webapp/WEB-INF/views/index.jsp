<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/inc/headerBase.jsp"%>
<c:set var="browserTitle" value="GREAT KOREA - Welcome" />
<c:set var="menuTitle" value="Welcome" />
<c:set var="fileName" value="index.jsp" />
<!DOCTYPE html>
<html>
<head>
<%@ include file="/resources/include/header.jsp"%>
<link rel="stylesheet" charset="UTF-8" href="<c:url value="/resources/css/index.css" />" />

<script type="text/javascript" charset="UTF-8" src="<c:url value="/resources/js/index.js" />"></script>
</head>
<body>
	<!-- Header Start -->
	<%@ include file="/resources/include/menu_top.jsp"%>
	<!-- Header end -->

	<!-- sideNav -->
	<%@ include file="/resources/include/menu_right.jsp"%>
	<!-- //sideNav -->

	<!-- contents -->
	<!-- main01 -->
	<%@ include file="/resources/include/main01.jsp"%>
	<!-- //main01 -->

	<!-- main02 -->
	<%@ include file="/resources/include/main02.jsp"%>
	<!-- //main02 -->
	
	<!-- main03 -->
	<%@ include file="/resources/include/main03.jsp"%>
	<!-- //main03 -->
	
	<!-- main04 -->
	<%@ include file="/resources/include/main04.jsp"%>
	<!-- //main04 -->
	
	<!-- main05 -->
	<%@ include file="/resources/include/main05.jsp"%>
	<!-- //main05 -->

	<!-- main06 -->
	<%--@ include file="/resources/include/main06.jsp"--%>
	<!-- //main06 -->
	<!-- //contents -->

	<!-- footer start -->
	<%@ include file="/resources/include/footer.jsp"%>
	<!-- footer end -->
</body>
</html>