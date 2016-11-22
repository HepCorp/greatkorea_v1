/**
* 목적 : 참고사항 글자수 체크
* 매개변수 : 없음
* 반환값 : 없음
* 개정이력 : 없음
*/
$(function(){
    $('#write').each(function(){
        var $maxcount = $('.reserve');
        var $input = $(".visitWrite");
        var $count = $(".count");
        var maximumCount = $maxcount.text() * 1;

        var update = function(){
            var before = $count.text() * 1;
            var now = $input.val().length;
           
            // 사용자가 입력한 값이 제한 값을 초과하는지를 검사한다.
            if (now > maximumCount) {
                var str = $input.val();
                $("#refCn").focus();
                var inputVal = str.substr(0, maximumCount);
                alert($maxcount.text() +'자를 초과하였습니다.');
                $input.val(inputVal);
            }
           
            // 필요한 경우 DOM을 수정한다.
            $count.text(now);
        };
        $input.bind('input keyup paste', function(){
            setTimeout(update, 0);
        });
        update();
    });
});
