public class TestUser {
    @Test
    public void testAddUserInvalidEmail() {
        assertThrows(EmailInvalidException.class, () -> User.add(new User(/* Invalid email */)));
    }
    @Test
    public void testAnalyseSoldeGeneral() {
        assertThrows(NegativeGeneralBalanceException.class, () -> /* Call with negative balance */);
    }

}
