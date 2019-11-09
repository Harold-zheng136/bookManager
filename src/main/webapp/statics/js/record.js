$(function () {

      $(".TbRecordmodif").on("click",function () {
          alert(123);
          var obj = $(this);
          window.location.href="/tbrecord/modifyexe?id="+obj.attr("id");
      });

})