package tg

import org.specs2.Specification

class FailingSpec extends Specification { def is = s2"""
  This test should just $fail
"""

  def fail = ko

}

