package leetcode.easy;

import leetcode.models.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class MaximumDepthBinaryTreeTest {

    private MaximumDepthBinaryTree underTest;

    @BeforeEach
    void setup() {
        underTest = new MaximumDepthBinaryTree();
    }

    @Test
    void firstTest() {
        assertEquals(3, underTest.maxDepth(
                        new TreeNode(
                                3,
                                new TreeNode(9),
                                new TreeNode(
                                        20,
                                        new TreeNode(15),
                                        new TreeNode(7)
                                )
                        )
                )
        );
    }

    @Test
    void secondTest() {
        assertEquals(2, underTest.maxDepth(
                        new TreeNode(
                                1,
                                null,
                                new TreeNode(2)
                        )
                )
        );
    }

}