function checkForm(form) {

	var errorMessage = "The following errors were found:";

	// check if name is entered

	var name = $('#name').value; 

	if (name.length < 0) 
		errorMessage += "<br/> You must give a name";



	$('#errors').innerHTML = errorMessage;
}

$("#myform").submit( function(event) {

	event.preventDefault();

	$("#myform").submit();
});


$(document).ready( function() {

	$('#myform').validate({

		rules: {
			field1: {
				required: true;
			}
		}
	})
});