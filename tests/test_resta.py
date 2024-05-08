import pytest

from ejercicios.operaciones import resta

class SumaTestClass:

    def test_resta(self):
        assert resta(9,5) == 4
        assert resta(-1,-2) == 1
        assert resta(-7,5) == -9
        assert resta(-7,9) == -16