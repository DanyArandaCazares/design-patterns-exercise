package oop.inheritance;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MainTest {
    @Test
    public void when1IsTyped_thenDoSaleIsCalled(){
        Application application = mock(Application.class);

        when(application.readKey()).thenReturn("1");

        Main.run(application);

        verify(application).clearScreen();
        verify(application).showMenu();
        verify(application).readKey();
        verify(application).doSale();

        verifyNoMoreInteractions(application);
    }

    @Test
    public void when2IsTyped_thenDoRefundIsCalled(){
        Application application = mock(Application.class);

        when(application.readKey()).thenReturn("2");

        Main.run(application);

        verify(application).clearScreen();
        verify(application).showMenu();
        verify(application).readKey();
        verify(application).doRefund();

        verifyNoMoreInteractions(application);
    }

    @Test
    public void when3IsTyped_thenPrintReportIsCalled(){
        Application application = mock(Application.class);

        when(application.readKey()).thenReturn("3");

        Main.run(application);

        verify(application).clearScreen();
        verify(application).showMenu();
        verify(application).readKey();
        verify(application).printReport();

        verifyNoMoreInteractions(application);
    }

    @Test
    public void when4IsTyped_thenShowConfigurationIsCalled(){
        Application application = mock(Application.class);

        when(application.readKey()).thenReturn("4");

        Main.run(application);

        verify(application).clearScreen();
        verify(application).showMenu();
        verify(application).readKey();
        verify(application).showConfiguration();

        verifyNoMoreInteractions(application);
    }
}
