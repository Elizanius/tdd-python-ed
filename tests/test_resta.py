import pytest

from ejercicios.operaciones import resta

class TestClass:

    def test_resta(self):
        assert resta(9,5) == 4
        assert resta(-1,-2) == 1
        assert resta(-7,5) == -12
        assert resta(-7,9) == -16