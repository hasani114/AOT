<%@ include file = "/templates/header.jsp" %>


<div class="jumbotron jumbotron-fluid">
<div class="container">
<h1>Art of Travel</h1>
  <hr class="my-4">
<p>At Art of Travel, we explore destinations, finding the best routes and the tastiest foods, meet with locals putting together exciting cultural experiences, 
take on extensive expeditions exploring all that is unique to a land and its people and scrutinize prices to bring you all of this at the most affordable rates
 possible!</p></div>
</div>


<div class="container">
<form action="Controller">
  <div class="row">
    <div class="form-group col-md-6">
      <label class="my-1 mr-2">Tour Name</label>
      <input type="text" class="form-control" name="tourname">
    </div>
    <div class="form-group col-md-6">
          <label class="my-1 mr-2">Country</label>
    
      <input type="text" class="form-control" name="country">
    </div>
  </div>
  <div class="row">
    <div class="form-group col-md-6">
          <label class="my-1 mr-2">Location</label>
    
      <input type="text" class="form-control" name="location">
    </div>
    <div class="form-group col-md-6">
      <label class="my-1 mr-2" for="inlineFormCustomSelectPref">Group Size</label>
   
      <select class="custom-select" name="groupsize">
    <option selected>6</option>
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="1">4</option>
    <option value="2">5</option>
    <option value="3">6</option>
    <option value="1">7</option>
    <option value="2">8</option>
    <option value="3">9</option>
    <option value="1">10</option>
    <option value="2">11</option>
    <option value="3">12</option>
    <option value="1">13</option>
    <option value="2">14</option>
    <option value="3">15</option>
  </select>
    </div>
  </div>
  <div class="row">
    <div class="form-group col-md-6">
      <input type="text" class="form-control" name="tourprice" placeholder="Price">
    </div>
    <div class="form-group col-md-6">
      <input type="text" class="form-control" name="tourlenght" placeholder="Number of Days">
    </div>
  </div>
  <button type="submit"  class="btn btn-primary">Add Tour</button>
</form>
</div>

<%@ include file = "templates/footer.jsp" %>
