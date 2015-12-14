counter = 1;
  function addInput(divName){
      console.log(arguments);

      var limit = 100;
         if (counter == limit)  {
              alert("You have reached the limit of adding " + counter + " inputs");
         }
         else {
           console.log(counter);
              var newdiv = document.createElement('div');
              newdiv.innerHTML ="<input type='datetime-local' name='d[" + (counter) + "]' form='connect'><input type='hidden' id='timestamp' name='t[" + (counter) + "]' form='connect'>"
              document.getElementById(divName).appendChild(newdiv);
              //"<input type='datetime-local' name='d[" + (counter) + "]' form='connect'>"
              //name='bind["+ (counter) + "]'

              //console.log(num);
              //document.getElementsByName('timestamp').forEach(function(ele){ele.setAttribute('value',num);}
              //document.getElementById('timestamp').setAttribute('value',num);
              //console.log(document.getElementById('timestamp').value);
              //document.getElementById('arrivalDate').remove();
              counter++;
         }
    }
function tranSub(){
  for (i=0; i < counter; i++){
    var ele = document.getElementsByName("d[" + i + "]")[0];
    var date=ele.value;
    console.log(date);
    var num = new Date(date).getTime();
    document.getElementsByName("t[" + i + "]")[0].setAttribute('value',num);
    console.log(document.getElementsByName("t[" + i + "]")[0].value);
    document.getElementsByName("d[" + i + "]")[0].remove();
  }

}



    //var ele = document.getElementById('arrivalDate');
    //var date=document.getElementById('arrivalDate').value;
