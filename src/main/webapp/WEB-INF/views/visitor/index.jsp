<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/inc/headerBase.jsp"%>
<c:set var="browserTitle" value="GREAT KOREA - 방명록" />
<c:set var="menuTitle" value="방명록" />
<c:set var="fileName" value="/visit/index.jsp" />
<!DOCTYPE html>
<html>
<head>
<%@ include file="/resources/include/header.jsp"%>
<link rel="stylesheet" charset="UTF-8" href="<c:url value="/resources/css/visitor.css" />" />
<script type="text/javascript" charset="UTF-8" src="<c:url value="/resources/js/jquery-3.1.1/jquery.js" />"></script>
<script type="text/javascript" charset="UTF-8" src="<c:url value="/resources/js/visitor.js" />"></script>
<script type="text/javascript">
function FormChkModule(f){
	if (f.contents.value == ""){
		alert("내용을 입력해 주세요.");
		f.contents.focus();
		return false;
	} else {
		if (f.contents.value.length < 5) {
			alert("내용을 입력해 주세요.");
			f.contents.focus();
			return false;
		}
	}
	return true;
}

</script>
</head>
<body>
	<!-- Header Start -->
	<%@ include file="/resources/include/menu_top.jsp"%>
	<!-- Header end -->

	<!-- contents Start -->
	<div id="middleWrapper">
		<div class="pageTitle">
			<div class="titleSection">
				<div class="titleWrap">
					<h2>방명록</h2>
					<h3>VISITORS</h3>
				</div>
			</div>
		</div>
		<!-- pageTitle -->
		<div class="contentSection">
			<div class="contentWrap">
				<!-- write Start -->
				<div class="write">
					<form name="saveFrm" action="<c:url value="/visit/save.do" />" method="post" onSubmit="return FormChkModule(this);">
					<fieldset>
					<legend class="blind">글쓰기</legend>
					<label for="write" class="blind">글쓰기</label>
						<div class="textarea">
							<textarea id="write" class="visitWrite" name="contents"
								cols="80" rows="5" placeholder="내용을 입력해 주세요."></textarea>
							<input type="submit" value="글쓰기" class="register" />
							<p class="txt_check">
								<span class="count">0</span>/<span class="reserve">300</span>자
							</p>
						</div>
					</fieldset>
					</form>
				</div>
				<!-- write end -->
				<!-- color Start -->
				<div class="color">

					<!-- search start -->
					<div class="srch_form">
						<form name="searchFrm"
							action="<c:url value="/visitor/index.do" />" method="post">
							<fieldset>
								<legend class="blind">검색창</legend>
								<label for="sbox" class="blind">검색어 입력</label> <input
									type="search" name="searchStr" id="sbox" class="sbox"
									placeholder=" 아이디" value="${searchStr }" maxlength="20" /> <input
									type="submit" value="검색" class="search" />
							</fieldset>
						</form>
					</div>
					<!-- search end -->

					<!-- list start -->
					<c:if test="${fn:length(visitorList) != 0 }">
						<c:forEach var="visitor" items="${visitorList }"
							varStatus="status">
							<fmt:formatDate value="${visitor.input_dt }" pattern="yyyy-MM-dd"
								var="input_dt" />
							<div class="${visitor.color }">
								<p>${visitor.contents }</p>
								<ul>
									<li>${visitor.write_id }&nbsp;&nbsp;&nbsp;|&nbsp;<span><a
											href="#">삭제</a></span></li>
									<li>${input_dt }</li>
								</ul>
							</div>
						</c:forEach>
					</c:if>
					<!-- list end -->

				</div>
				<!-- color end -->

				<!-- paging start -->
				<div class="page">
					<ul>
						<li><c:if test="${paging.pageNo > 1 }">
								<a href="index.do?page=${paging.prevPageNo }">◀ <span>이전</span></a>
							</c:if> <c:if test="${paging.pageNo <= 1 }">
				      		◀ <span>이전</span>
							</c:if></li>
						<li><span>${paging.pageNo }</span> / ${paging.finalPageNo }</li>
						<li><c:if test="${paging.pageNo < paging.finalPageNo }">
								<a href="index.do?page=${paging.nextPageNo }"><span>다음</span>
									▶ </a>
							</c:if> <c:if test="${paging.pageNo >= paging.finalPageNo }">
								<span>다음</span> ▶
				      	</c:if></li>
					</ul>
				</div>
				<!-- paging end -->
			</div>
			<!-- //contentsWrap -->
		</div>
		<!-- //contentSection -->
	</div>
	<!-- contents end -->

	<!-- footer start -->
	<%@ include file="/resources/include/footer.jsp"%>
	<!-- footer end -->
</body>
</html>