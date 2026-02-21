function validateSignup() {
    const mobile = document.forms["signupForm"]["mobile"].value;
    const age = document.forms["signupForm"]["age"].value;
    if (!/^[0-9]{10}$/.test(mobile)) {
        alert("Mobile number must be 10 digits.");
        return false;
    }
    if (isNaN(age) || age < 1 || age > 120) {
        alert("Enter a valid age between 1 and 120.");
        return false;
    }
    return true;
}
