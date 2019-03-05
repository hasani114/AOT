/**
 * 
 */


  function DisableNullFields() {
        $('input[type=text]').each(function(i) {
            var $input = $(this);
            if ($input.val().trim() == '')
               $input.attr('disabled', 'disabled');
        });
    }
  
  function toursavailable () {
	  
	  var number = document.getElementsByClassName('card-media-body-heading');
	  var tours = number.length;
	  var message = document.getElementById('errors');
	  message.classList.add('alert', 'alert-success');
	  message.innerHTML =  tours + ' tours available.';


  }
  
  
/*function testing() {
	
	if (string === '38') {
		
		var div = document.getElementById('errors');
		div.innerHTML = 'Error Messages Go Here.';
		div.classList.add('alert-danger', 'alert');
		console.log('Hasan is logged in');

	}

}

function searchbutton() {
	
	var div = document.getElementById('errors');
	div.innerHTML = 'Ready to Execute Search';
	div.classList.remove('alert-danger');
	div.classList.add('alert-success');
	setTimeout(function () {
		div.classList.remove('alert-success');
		div.classList.add('alert-warning');
	}
	, 2000)
	
}*/


 
  
//alert('hello world');


//var name = 'hasan test';
//var age = 31;
//
//console.log(name + " " + age);
//
//
//
//var myfunc = function() {
//	
//	return 'this is my function';
//}
//
//console.log(myfunc());