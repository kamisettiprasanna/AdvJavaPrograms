
//Function declaration
function fruitProcessor(apples,oranges){
	document.write("juice preparing with"+apples+" apples and "+oranges+" oranges");

}
fruitProcessor(8,6)
function cutFruitPieces(fruit){
	
	document.write("fruit with"  +fruit+  "pieces");
	document.write("juice preparing with"+fruit*apples+"apples"+"and"+fruit*oranges);
		return fruit*apples;
	
}
//function calling 
cutFruitPieces(4)
