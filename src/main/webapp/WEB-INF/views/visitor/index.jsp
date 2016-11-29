<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/inc/headerBase.jsp" %>
<c:set var="browserTitle" value="GREAT KOREA" />
<c:set var="menuTitle" value="방명록" />
<!DOCTYPE html>
<html>
<head>
<%@ include file="/resources/include/header.jsp" %>
<link rel="stylesheet" href="<c:url value="/resources/css/visitor.css" />" />
<script type="text/javascript" src="<c:url value="/resources/js/jquery-3.1.1.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/visitor.js" />"></script>
</head>
<body>
   <div class="bodyWrap">
      <!-- Header Start -->
      <div class="headerWrap">

         <!-- Login Start -->
         <div class="loginWrap">
            <div id="login">
               <ul>
                  <li><a href="#">고객지원</a></li>
                  <li><a href="#">회원가입</a></li>
                  <li><a href="#">로그인</a></li>
               </ul>
            </div>
         </div>

         <!-- Login end -->
         <!-- Navigation Start -->
         <div class="topNav">
            <div class="navWrap">
               <div class="greatkorea_logo">
                  <a href="http://www.greatkorea.co"> <img
                     src="../img/greatkorea_logo.png" alt="그레이트 코리아 로고" />
                  </a>
               </div>
               <div class="navList">
                  <div class="nav">
                     <dl>
                        <dt>
                           <a href="#">방명록</a>
                        </dt>
                        <dd>
                           <a href="#">VISITORS</a>
                        </dd>
                     </dl>
                     <dl>
                        <dt>
                           <a href="#">파트너</a>
                        </dt>
                        <dd>
                           <a href="#">PARTNER</a>
                        </dd>
                     </dl>
                     <dl>
                        <dt>
                           <a href="#">언론보도</a>
                        </dt>
                        <dd>
                           <a href="#">MEDIA</a>
                        <dd>
                     </dl>
                     <dl>
                        <dt>
                           <a href="#">인사말</a>
                        </dt>
                        <dd>
                           <a href="#">GREETING</a>
                        </dd>
                     </dl>
                     <dl>
                        <dt>
                           <a href="#">진출분야</a>
                        </dt>
                        <dd>
                           <a href="#">DIVISION</a>
                        <dd>
                     </dl>

                     <dl>
                        <dt>
                           <a href="#">회사소개</a>
                        </dt>
                        <dd>
                           <a href="#">INTRODUCTION</a>
                        </dd>
                     </dl>
                  </div>
               </div>
            </div>
         </div>
      </div>
      <!-- Navigation end -->
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
         <div class="contentSection">
            <div class="contentWrap">
            <!-- write Start -->
               <div class="write">
               		<form action="#" method="post">
				    	<fieldset>
				    		<legend class="blind">글쓰기</legend>
				    		<label for="write" class="blind">글쓰기</label>
				    			<div class="textarea">
				            		<textarea id="write" class="visitWrite" name="write" cols="80" rows="5" placeholder="내용을 입력해 주세요."></textarea>
				            		<input type="submit" value="글쓰기" class="register" />
				            		<p class="txt_check"><span class="count">0</span>/<span class="reserve">300</span>자</p>
				         		</div>
				      	</fieldset>
				    </form>
               </div>
            <!-- write end -->
            <!-- color Start -->
               <div class="color">
                      
	               <div class="srch_form">
					   <form action="#" method="post">
					      <fieldset>
					         <legend class="blind">검색창</legend>
					         <label for="sbox" class="blind">검색어 입력</label>
					         <input type="search" id="sbox" class="sbox" placeholder=" 아이디" />
					         <input type="submit" value="검색" class="search" />
					      </fieldset>
					   </form>
					</div>
					${fn:length(visitorList) }
					<c:if test="${fn:length(visitorList) != 0 }">
					<c:forEach var="visitor" items="${visitorList }" varStatus="status">
					<div class="yellow">
					   <p>${visitor.contents }</p>
					      <ul>
					         <li>${visitor.write_id } &nbsp;&nbsp;&nbsp;| &nbsp;</li>
					         <li>${fn:input_dt }</li>
					      </ul>
					</div>
					</c:forEach>
					</c:if>
					
					<div class="pink">
					   <p>Apple is an American mulelops, and sells consumer electronics, computer software, and online services. Its hardware products include the iPhone smartphone, the iPad tablet computer, the Mac personal computer, the iPod portable media player, the Apple Watch smartwatch, and the Apple TV digital media player. Apple's consumer software includes the macOS and iOS operating systems, the iTunes media player, the Safari web browser, and the iLife and iWork creativity and productivity suites. Its online services include the iTunes Store, the iOS App Store and Mac App Store, Apple Music, and iCloud.</p>
					      <ul>
					         <li>홍길동님 &nbsp;&nbsp;&nbsp;| &nbsp;<span><a href="#">삭제</a></span></li>
					         <li>2016-11-09</li>
					      </ul>
					</div>
					
					<div class="blue">
					   <p>Apple is an the iPad tablet c the Apple TV digital media player. Apple's consumer software includes the macOS and iOS operating systems, the iTunes media player, the Safari web browser, and the iLife and iWork creativity and productivity suites. Its online services include the iTunes Store, the iOS App Store and Mac App Store, Apple Music, and iCloud.</p>
					      <ul>
					         <li>kimleooo3 &nbsp;&nbsp;&nbsp;| &nbsp;</li>
					         <li>2016-11-09</li>
					      </ul>
					</div>
					
				</div>
				<!-- color end -->
				 
				<div class="page">
				   <ul>
				      <li><a href="#">◀ <span>이전</span></a></li>
				      <li><span>2</span> / 20</li>
				      <li><a href="#"><span>다음</span> ▶ </a></li>
				   </ul>
				</div>
				
            </div>
         </div>
      </div>
      <!-- contents end -->
   </div>
</body>
</html>