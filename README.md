# upwork
# Usage
getCardsImage() returns image path captured from camera

cardsScanResult(scannedCards : List<CardScan>) Call to send the result

class CardScan {
    var cardType: String? = null
    var cardRank: String? = null
}

Example: cardType = Heart, cardRand : King
