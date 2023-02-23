package chicken

class ChickenCalculator(insectsPerMinute: Int) {
  def searchInsects(minutes: Int): Int = insectsPerMinute * minutes
}
