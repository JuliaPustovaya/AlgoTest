import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.number.OrderingComparison.greaterThan;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NodeListTest {
	private static final int valueForDelete = 8;
	private static final int valueForAdding = 89;
	private NodeList nodeListTest;

	@Before
	public void initialize() {
		nodeListTest = new NodeList();
		nodeListTest.addElementFront(5);
		nodeListTest.addElementBack(6);
		nodeListTest.addElementBack(7);
		nodeListTest.addElementBack(8);
		nodeListTest.addElementBack(9);
		nodeListTest.addElementBack(10);
	}

	@Test
	public void checkNodeListContainsValue() {
		assertThat("The nodelist doesn't contain the specified value", nodeListTest.contains(valueForDelete), is(true));
	}

	@Test
	public void checkRemoveElementMethod() {
		int sizeBeforeRemoving = checkGetSizeNodeList();
		assertThat("The nodelist is empty", nodeListTest.remove(valueForDelete), is(true));
		assertThat(sizeBeforeRemoving, greaterThan(checkGetSizeNodeList()));
	}

	@Test
	public void checkAddFrontMethod() {
		assertThat(nodeListTest.getHead(), notNullValue());
	}

	@Test
	public void checkAddBackMethod() {
		assertThat(nodeListTest.getSize(), greaterThan(1));
		nodeListTest.addElementBack(valueForAdding);
		assertThat(checkGetSizeNodeList(), greaterThan(nodeListTest.getSize()));
	}

	public int checkGetSizeNodeList() {
		int previousSize = 0;
		NodeList tempNodeList = nodeListTest.getHead();
		while (tempNodeList != null) {
			previousSize++;
			tempNodeList = tempNodeList.getNext();
		}
		return previousSize;
	}
}
