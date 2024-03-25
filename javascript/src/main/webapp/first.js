
var heightRatan=parseFloat(prompt("enter Ratan sir height"));
var massRatan=parseFloat(prompt("enter ratan sir mass"));
var heightAnu=parseFloat(prompt("enter Anu mam height"));
var massAnu=parseFloat(prompt("enter Anu mam mass"));
var BMIRatan,BMIAnu;
BMIRatan=massRatan/(heightRatan*heightRatan);
BMIAnu=massAnu/(heightAnu*heightAnu);
console.log("BMI of the ratan="+BMIRatan);
console.log("BMI of Anu="+BMIAnu);
document.write("BMI of the ratan="+BMIRatan);
document.write("BMI of Anu="+BMIAnu);