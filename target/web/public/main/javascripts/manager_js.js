counter = 1;
counterArray = [0];
function removeDate(counter) {
    var elem = document.getElementById('removedate_'+counter);
   elem.parentNode.removeChild(elem);
   //Remove a particular element from an array
   var index=counterArray.indexOf(counter);
   if (index > -1) {
    //Adding Array Elements
    counterArray.splice(index, 1);
    }
    console.log(counterArray);
   return false;
}
function addInput(divName){
      var limit = 100;
         if (counter == limit)  {
              alert("You have reached the limit of adding " + counter + " inputs");
         }
         else {
           console.log(counter);
              var newdiv = document.createElement('div');
              newdiv.innerHTML ="<div id=removedate_"+(counter)+"></br><input type='datetime-local' name='d[" + (counter) + "]' form='connect'><input type='hidden' id='timestamp' name='t[" + (counter) + "]' form='connect'><input type=button id=more_fields"+(counter)+" onclick=removeDate("+(counter)+"); value='Remove' ></div>"
              document.getElementById(divName).appendChild(newdiv);
              counterArray.push(counter);
              counter++;
              console.log(counterArray)
         }
    }
function tranSub(){
  for (var i=0; i < counterArray.length; i++){
    var ele = document.getElementsByName("d[" + counterArray[i] + "]")[0];
    var date=ele.value;
    console.log(date);
    var num = new Date(date).getTime();
    document.getElementsByName("t[" + counterArray[i] + "]")[0].setAttribute('value',num);
    console.log(document.getElementsByName("t[" + counterArray[i] + "]")[0].value);
    document.getElementsByName("d[" + counterArray[i] + "]")[0].remove();
  }
}