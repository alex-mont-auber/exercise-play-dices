// ** -- BASE STRUCTURE -- **\\

function openTab(evt, cityName) 
{

    // Variables

  var i, tabcontent, tablinks;

    // Get all elements with class="tabcontent" and hide them

  tabcontent = document.getElementsByClassName("tabcontent");

  for (i = 0; i < tabcontent.length; i++) 
  {
    tabcontent[i].style.display = "none";
  }

    // Get all elements with class="tablinks" and remove the class "active"

  tablinks = document.getElementsByClassName("tablinks");

  for (i = 0; i < tablinks.length; i++) 
  {
    tablinks[i].className = tablinks[i].className.replace(" active", "");
  }

    // Show the current tab, and add an "active" class to the button that opened the tab

  document.getElementById(cityName).style.display = "block";
  
  evt.currentTarget.className += " active";
} 


// ** -- AJAX Dice Games -- ** \\

    // ** -- URL BASE

const url = "http://localhost:8080";


    // ** -- POST

function createPlayer() 
{
    //let actualDate = new Date();

    let takeInfo = 
    {
        idPlayer: "",
        playerName: $("#inputName").val(),
        perCentSuccess: 0,
        numberGames:0,
        dateRegistrer: "",
    }

    $.ajax({
        type:'POST',
        url: url + '/players',
        contentType: 'application/json',
        data: JSON.stringify(takeInfo),
        success: function()
        {
        if(takeInfo.playerName == null) {
            takeInfo.playerName = "Anonymous";
        }
          document.getElementById("presentationBox").innerHTML = "";
          document.getElementById("presentationBox").innerHTML = "<p>Nice! Welcome " + takeInfo.playerName + "! now you can access to all application for play! Good luck! Click in Join Game for enter games!</p>";
        },
        error: function() 
        {
            document.getElementById("presentationBox").innerHTML = "";
            document.getElementById("presentationBox").innerHTML = "<p>The registration was not successful! Please try again...</p><button onclick='location.reload()'>Refresh</button>";
        }
    })
}

    //  ** -- GETS 

function showRanking() {
    $.ajax({
        type: 'GET',
        url: url + '/players',
        contentType: 'application/json',
        success: function()
        {
    
        }
    })
}
