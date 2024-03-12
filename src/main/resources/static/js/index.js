let hot = document.querySelector("#toggle");
function blink(){
    hot.classList.toggle("red_toggle");
}
setInterval(blink, 700);