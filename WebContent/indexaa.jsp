<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		
		<title>betechie</title>
		<meta name="keywords" content="">
		<meta name="description" content="">
		<meta http-equiv="X-UA-Compatible" content="IE=Edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		
		<link rel="stylesheet" href="css/animate.min.css">
		<link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet"  href="css/style.css">		
		<script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/validator.min.js"></script>
        </head>
        <body>
            <section id="main">
                <div class="col-md-6 col-sm-6">
                <div class="betechie-sec">
                    <img  src="images/Logo.png" class="img-responsive" alt="Logo">
                    <div class="home">
                    <h2>We know your potential, <br> <span>Do you?</span> </h2>

                    <p>Unlock your talent in the Domain of Coding irrelevant of your current profession.<br>Our Predictive Analysis and Progressive Block Training help us to customize the course that will suit you the most. Leave your email below, to keep you posted with our upcoming course.</p>
                </div>
                <form method="post" id="contactForm" data-toggle="validator" class="shake">
                    <div class="row">
                        <div class="form-group col-md-8 col-sm-8 col-xs-8">
                            
                            <input type="email" class="" id="email" name="e_Email_ID" placeholder="Enter your email to get notified" required data-error="Enter the valid Email id">
                            <div class="help-block with-errors"></div>
                        </div>
                        <div class="form-group col-md-4 col-sm-4 col-xs-4">
                            <button type="submit" id="save_data" class=" ">Subscribe</button>
                            </div>
                        </div>
                    </form>
                    <script>
$(document).ready(function() {
$("#save_data").click(function() {
/* alert("succeess"); */
$.ajax({
url: "indexbb.jsp",
type: "post",
data: {
e_Email_ID:$('#email').val(),

success : function(data){
	alert("thank you for subscribing.we have sent our brochure to your email.");
}
}
});
});
});
</script>
                </div>
                </div>
                <div class="col-md-6 col-sm-6 betechie-sec2 ">
                    <img src="images/BG.png" class="img-responsive" alt="background image">
                </div>
            </section>
        </body>
        </html>