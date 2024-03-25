function palindrome(){
	//read the name store in variable
	var name =document.getElementById('name').value;
	var rem=0;
	var temp=parseInt(name);
	var rev=0;
	while(parseInt(name>0)){
		rem=parseInt(name%10);
		rev=(rev*10)+rem;
		name=parseInt(name/10);
		}
		
		if(rev==temp){
			alert("palindrome");
			
		}
		else{
			alert("not a palindrome");
		}
		}
	
