
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.number.OrderingComparison.greaterThan;

import org.junit.BeforeClass;
import org.junit.Test;

public class NodeListTest {
	static NodeList nodeList;
	static int valueForDelete = 8;
	static int valueForAdding = 89;

	@BeforeClass
	public static void initialize() {
		nodeList = new NodeList();
		nodeList.addElementFront(5);
		nodeList.addElementBack(6);
		nodeList.addElementBack(7);
		nodeList.addElementBack(8);
		nodeList.addElementBack(9);
		nodeList.addElementBack(10);
	}

	@Test
	public void checkNodeListContainsValue() {

		assertThat("The nodelist doesn't contain the specified value", nodeList.isContainedValue(valueForDelete), is(true));
	}

	@Test
	public void checkRemoveElementMethod() {
		int sizeBeforeRemoving = checkGetSizeNodeList();
		assertThat("The nodelist is empty", nodeList.isElementRemoved(valueForDelete), is(true));
		assertThat(sizeBeforeRemoving, greaterThan(checkGetSizeNodeList()));

	}

	@Test
	public void checkAddFrontMethod() {
		assertThat(nodeList.getHead(), notNullValue());
	}

	@Test
	public void checkAddBackMethod() {
		int sizeBeforeAdding = checkGetSizeNodeList();
		assertThat(nodeList.getTail(), notNullValue());
		assertThat("Head==Tail", nodeList.getHead(), not(nodeList.getTail()));
		nodeList.addElementBack(valueForAdding);
		assertThat(checkGetSizeNodeList(), greaterThan(sizeBeforeAdding));

	}

	public int checkGetSizeNodeList() {
		int previousSize = 0;
		NodeList tempNodeList = nodeList.getHead();
		while (tempNodeList != null) {
			previousSize++;
			tempNodeList = tempNodeList.getNext();
		}
		return previousSize;
	}
}
