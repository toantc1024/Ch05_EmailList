<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link rel="stylesheet" href="./styles/main.css"/>
</head>
<body>
<div class="wrapper">

    <div class="murach_logo">
        <img  src="./assets/img.png" />
    </div>

        <div>
            ${error}
        </div>

    <form method="post" action="emailList">
        <h1>Survey</h1>
        <p>If you have a moment, we'd appreciate it if you would fill out this survey.</p>

        <h2>Your information</h2>


<div class="input_group">
    <div class="input">
        <label for="firstName">First Name</label>
        <input name="firstName">
    </div>
    <div class="input">
        <label for="lastName">Last Name</label>
        <input name="lastName" required>
    </div>
    <div class="input">
        <label for="email">Email</label>
        <input name="email"  type="email" required>
    </div>
    <div class="input">
        <label for="dob" >Date of Birth</label>
        <input name="dob" required>
    </div>
</div>
        <h2>How did you hear about us?</h2>

        <div style="display:flex; gap:1rem">
            <div>
                <input type="radio" id="se" name="hear_us_option" value="Search engine" checked>
                <label for="se">Search engine</label><br>

            </div>

            <div>
                <input type="radio" id="wom" name="hear_us_option" value="ord of mouth">
                <label for="wom">Word of mouth</label><br>
            </div>
            <div>
                <input type="radio" id="soc" name="hear_us_option" value="Social media">
                <label for="soc">Social media</label><br>
            </div>       <div>
            <input type="radio" id="oth" name="hear_us_option" value="Other">
            <label for="oth">Other</label><br>
        </div>
        </div>

        <h2>Would you like to receive announcements about new CDs and special offers?</h2>
        <input type="checkbox" id="il" name="options" value="Like to receive announcements">
        <label for="il"> YES, I'd like that.</label><br>
        <input type="checkbox" id="sen" name="options" value="Receive announcements via email">
        <label for="sen">YES, please send me email announcements.</label><br>

            <label for="contacts">Please contact me by:</label>
            <select name="contactMeBy" id="contacts">
                <option value="emailOrPostal">Email or postal email</option>
                <option value="phone">Phone</option>
                <option value="inPerson">In person</option>
            </select>
            <br><br>
            <input type="submit" class="button" value="Submit">
    </form>




</div>
</body>
</html>