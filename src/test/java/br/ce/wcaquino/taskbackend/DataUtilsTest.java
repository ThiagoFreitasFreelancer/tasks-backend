package br.ce.wcaquino.taskbackend;
import br.ce.wcaquino.taskbackend.utils.DateUtils;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class DataUtilsTest {

    @Test
    public void deveRetornarTrueParaDataFuturas(){

        LocalDate date = LocalDate.of( 2030, 01, 01 );
        Assert.assertTrue( DateUtils.isEqualOrFutureDate( date ) );
    }

    @Test
    public void deveRetornarFalseParaDataPassadas(){

        LocalDate date = LocalDate.of( 2010, 01, 01 );
        Assert.assertFalse( DateUtils.isEqualOrFutureDate( date ) );
    }

    @Test
    public void deveRetornarTrueParaDataAtual(){

        LocalDate date = LocalDate.now();
        Assert.assertTrue( DateUtils.isEqualOrFutureDate( date ) );
    }

}
