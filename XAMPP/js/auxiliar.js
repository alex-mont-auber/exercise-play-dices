// ** -- Auxiliar functions

function randomNumber() /* TRYING TO APPLY IN BACK DIRECTLY */ 
{
    let randomNumber = Math.floor(Math.random() * 6) + 1;

    return randomNumber;
};

function sumResult() /* TRYING TO APPLY IN BACK DIRECTLY */ 
{
    let finalSum = diceOne + diceTwo + diceThree + diceFour + diceFive + diceSix;

    return finalSum;
}

function winOrNotTwoDices() /* TRYING TO APPLY IN BACK DIRECTLY */ 
{
    if(diceResult == 7) 
    {
        return 1;
    } 
    else 
    {
        return 0;
    }
};

function winOrNotSixDices() 
{
    if(diceResult == 6 || diceResult == 5)
    {
        return 1;
    } 
    else 
    {
        return 0;
    }
}

// ** -- Game Stetic Transformer

function TwoDicesGame() 
{
    document.getElementById("joinGame").innerHTML ="";
    document.getElementById("joinGame").innerHTML = '<h2>Two Dices Modality</h2><div class="centerDivs buttonStyles"><table class="tableStyle"><tr><th>Player id</th><th>Name Player</th><th>Dice One</th><th>Dice Two</th><th>Dice Result</th><th>Final Result</th></tr></table><button class="styleDiceButtons styleAuxiliarButton" onclick="joinGameTwoDices()">New Game</button><button class="styleDiceButtons" onclick="goBack()">Back</button></div>';
}

function SixDicesGame() 
{
    document.getElementById("joinGame").innerHTML ="";
    document.getElementById("joinGame").innerHTML = '<h2>Six Dices Modality</h2><div class="centerDivs"><table class="tableStyle"><tr><th>Player id</th><th>Name Player</th><th>Dice One</th><th>Dice Two</th><th>Dice Three</th><th>Dice Four</th><th>Dice Five</th><th>Dice Six</th><th>Dice Result</th><th>Final Result</th></tr></table><button class="styleDiceButtons styleAuxiliarButton" onclick="joinGameSixDices()">New Game</button><button class="styleDiceButtons" onclick="goBack()">Back</button></div>';
}

function goBack()
{
    document.getElementById("joinGame").innerHTML ="";
    document.getElementById("joinGame").innerHTML = '<h2>We have two types of game, 2 dices and 6 dices, choice your game here.</h2><div class="centerDivs buttonStyles"><button class="styleDiceButtons styleAuxiliarButton" onclick="TwoDicesGame()">2 Dices</button><button class="styleDiceButtons" onclick="SixDicesGame()">6 Dices</button></div>';
}