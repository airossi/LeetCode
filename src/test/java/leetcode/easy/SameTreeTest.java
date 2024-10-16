package leetcode.easy;

import leetcode.models.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class SameTreeTest {

    private SameTree underTest;

    @BeforeEach
    void setup() {
        underTest = new SameTree();
    }

    @Test
    void firstTest() {
        assertTrue(underTest.isSameTree(
                new TreeNode(
                        1,
                        new TreeNode(2),
                        new TreeNode(3)
                ),
                new TreeNode(1,
                        new TreeNode(2),
                        new TreeNode(3))
                )
        );
    }

    @Test
    void secondTest() {
        assertFalse(underTest.isSameTree(
                        new TreeNode(
                                1,
                                new TreeNode(2),
                                null
                        ),
                        new TreeNode(1,
                                null,
                                new TreeNode(2))
                )
        );
    }
}