<%@ include file = "/templates/header.jsp" %>
<%@ include file = "/templates/banners/about-us.jsp" %>

  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
  
  
  
  <div class="container mt-5">
  
  <button class="btn btn-primary" id="activties" onclick="revealAct();"> Select Activities </button>
  
  <form action="Controller" class="activities" style="display:none;" id="activitiesform">
  <div class="form-check">
  <input class="form-check-input" type="checkbox"  name="Activities" value="Skiing" id="skiing">
    <label class="form-check-label" for="skiing">Skiing</label>
</div>

  <div class="form-check">

  <input class="form-check-input" type="checkbox" name="Activities" value="Snorkeling">
    <label class="form-check-label" for="inlineCheckbox1">Snorkeling</label>
  </div>
    <div class="form-check">
  
  <input class="form-check-input" type="checkbox"  name="Activities" value="Scuba">
    <label class="form-check-label" for="inlineCheckbox1">Scuba</label>
  </div>
    <div class="form-check">
  
  <input class="form-check-input" type="checkbox" name="Activities" value="Trekking">
    <label class="form-check-label" for="inlineCheckbox1">Trekking</label>
  </div>
  <input class="btn btn-secondary" type=submit value="submit">
  </form>
  
  <div><h1>Hello Word</h1> </div>
  
</div>


<script>

function revealAct() {
	
	var form = document.getElementById('activitiesform');
	
			  if (form.style.display === "none") {
		    form.style.display = "block";
		  } else {
		    form.style.display = "none";
		  }
		}
	
	




</script>
  </form>
  </div>
  
  
  
  
  
  
  
  
  
  
  
   <%@ include file = "templates/footer.jsp" %>