/**
 * 
 */

//Disable empty form fields so they are not submitted to the server
  function DisableNullFields() {
        $('input[type=text]').each(function(i) {
            var $input = $(this);
            if ($input.val().trim() == '')
               $input.attr('disabled', 'disabled');
        });
    }
  
 //Ensure that both password and repeat password field values are the same
  
function checkPassword() {
	  
	  var pass = document.getElementById('password-one').value;
	  var pass2 = document.getElementById('password-two').value;
	  var errmessage = document.getElementById('password-message');
	  var btn = document.getElementById('submitbutton');
	
	  
	  if (pass != pass2) {
		  errmessage.innerHTML = "Passwords Do Not Match";
		  btn.setAttribute('disabled', true);
		  
	  } else 		{
		  errmessage.innerHTML = "Passwords Match"; 
		  btn.removeAttribute('disabled');

	  }
	  				
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


 
  
/*alert('hello world');


var name = 'hasan test';
var age = 31;

console.log(name + " " + age);


var myfunc = function() {
	
	return 'this is my function';
}
console.log(myfunc());*/