
async function getWonders(){
    const hthree = document.getElementById("inject-h3");
    const wonderimg = document.getElementById("dynamic-img");
    try{
        const response = await fetch("http://localhost:8080/api/wonder/all");
        const responseJSO = await response.json();
        hthree.innerText = `my favorite wonder is ${responseJSO[0].name} in ${responseJSO[0].location}`;
        wonderimg.src = responseJSO[0].image;
    }
    catch(e){
        console.log(e);
    }

}

getWonders();