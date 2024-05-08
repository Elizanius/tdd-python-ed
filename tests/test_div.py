import pytest

from ejercicios.operaciones import div

class DivTestClass:

    def test_div(self):
        assert div(2,1) == 2.0
        assert div(-1,0) == 0.0
        assert div(4,2) == 2.0
        assert div(-2,-1) == 2.0