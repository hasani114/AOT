<%@ include file = "/templates/header.jsp" %>



<div class="container">

<input type="text" name="daterange" value="01/01/2018 - 01/15/2018" />

<script>
$(function() {
  $('input[name="daterange"]').daterangepicker({
    opens: 'right'
  }, function(start, end, label) {
    console.log("A new date selection was made: " + start.format('YYYY-MM-DD') + ' to ' + end.format('YYYY-MM-DD'));
  });
});
</script>
    </div>
    
    
    

    
  


<%@ include file = "/templates/footer.jsp" %>
