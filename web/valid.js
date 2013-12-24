/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
function validate()
{	
	var file=document.f.no.value;
	var divobj=document.getElementById('errors');
              if(file=="")
	{
	  divobj.style.display="block";
	  divobj.innerHTML="<font color=red>Should not be blank</font>";
	  return false;
	}
	return true;
}

