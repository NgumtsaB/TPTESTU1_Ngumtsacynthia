public class TestUser {
    @Test
    public void testAddUserInvalidEmail() {
        assertThrows(EmailInvalidException.class, () -> User.add(new User(/* Invalid email */)));
    }

}
