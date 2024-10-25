package leetcode.easy;

import leetcode.models.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinDepthBinaryTreeTest {

    private MinDepthBinaryTree underTest;

    @BeforeEach
    void setup() {
        underTest = new MinDepthBinaryTree();
    }

    @Test
    void firstTest() {
        assertEquals(2, underTest.minDepth(
                        new TreeNode(
                                3,
                                new TreeNode(9),
                                new TreeNode(20,
                                        new TreeNode(15),
                                        new TreeNode(7))
                        )
                )
        );
    }

    @Test
    void secondTest() {
        assertEquals(3, underTest.minDepth(
                        new TreeNode(
                                2,
                                null,
                                new TreeNode(3,
                                        null,
                                        new TreeNode(4))
                        )
                )
        );
    }

}