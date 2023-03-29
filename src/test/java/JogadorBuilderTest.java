import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JogadorBuilderTest {
    @Test
    public void deveRetornarExcecaoParJogadorSemId() {
        try {
            JogadorBuilder jogadorBuilder = new JogadorBuilder();
            Jogador jogador = jogadorBuilder
                    .setNome("Jogador 1")
                    .setEmail("jogador1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Id inválido", e.getMessage());
        }
    }

    @Test
    public void deveRetornarExcecaoParaJogadorSemNome() {
        try {
            JogadorBuilder jogadorBuilder = new JogadorBuilder();
            Jogador jogador = jogadorBuilder
                    .setId(1)
                    .setEmail("jogador1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    public void deveRetornarExcecaoParaJogadorSemClasse() {
        try {
            JogadorBuilder jogadorBuilder = new JogadorBuilder();
            Jogador jogador = jogadorBuilder
                    .setId(1)
                    .setNome("Jogador 1")
                    .setEmail("jogador1@email.com")
                    .setClasse("")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Classe inválida", e.getMessage());
        }
    }

    @Test
    public void deveRetornarExcecaoParaJogadorMestre() {
        try {
            JogadorBuilder jogadorBuilder = new JogadorBuilder();
            Jogador jogador = jogadorBuilder
                    .setId(1)
                    .setNome("Jogador 1")
                    .setEmail("jogador1@email.com")
                    .setClasse("mestre")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Jogador é mestre", e.getMessage());
        }
    }

    @Test
    public void deveRetornarJogadorValido() {
        JogadorBuilder jogadorBuilder = new JogadorBuilder();
        Jogador jogador = jogadorBuilder
                .setId(1)
                .setNome("Jogador 1")
                .setEmail("jogador1@email.com")
                .setClasse("necromante")
                .build();

        assertNotNull(jogador);
    }
}
