const displayNode = document.querySelector("#display");
const formNode = document.querySelector("#form");
let btnState = true;


const ENDPOINT = "http://localhost:8080";
fetch(ENDPOINT+"/articles")
    .then((reponse)=> reponse.json())
    .then((articles)=>{
        const ulNode = document.createElement("ul");
        displayNode.append(ulNode);
        
        for (const article of articles) {
            const liNode = document.createElement("li");
            liNode.innerText = `Titre: ${article.titre}, 
                                Contenu: ${article.contenu}, 
                                Auteur: ${article.auteur}`;
            ulNode.append(liNode);                                
        }

    })


function afficherForm(event){
    if(btnState){
        displayNode.style = "display:none;";
        formNode.style = "display:block;";
        event.target.innerText="Afficher liste"
        btnState=false;
    }else{
        displayNode.style = "display:block;";
        formNode.style = "display:none;";
        event.target.innerText="Ajouter un article"
        btnState=true;
    }
}

/**
 * Requete POST (AJAX)
 */

function ajouterArticle(event){

    const titreNode = document.querySelector("#titre");
    const contenuNode = document.querySelector("#contenu");
    const auteurNode = document.querySelector("#auteur");

    const article = {
        titre: titreNode.value,
        contenu: contenuNode.value,
        auteur: auteurNode.value
    };

    fetch(ENDPOINT+"/articles",{
        method:"POST",
        headers:{
            "Content-Type":"application/json"
        },
        body: JSON.stringify(article)
    })
    .then((response)=> response.json())
    .then((article)=>{
        if(article.id>0){
            console.log("Article a bien été ajouté");
        }
    })

}