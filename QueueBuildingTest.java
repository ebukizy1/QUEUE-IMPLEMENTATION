package queue_Building;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class QueueBuildingTest {
    Queues queue = new Queues();

    @Test
    public void testQueueExist(){
        assertNotNull(queue);
    }
  @Test
  public void testCheckIfTheQueueIsEmpty(){
        queue.isEmpty();
        assertTrue(queue.isEmpty());
    }
    @Test
    public void testWhenIEnQueue_X_InTheQueueTheIsNotEmpty(){
        queue.enqueue("emmanuel");
        assertFalse(queue.isEmpty());
    }
    @Test
    public void testWhenIEnqueue_X_And_DeQueueFromThe_QueueThe_QueueIsEmpty(){
        queue.enqueue("emmanuel");
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }
    @Test
    public void testWhenIEnqueue_X_Y_AndDequeueFrom_The_QueueTheFirstGuyLeaves(){
    queue.enqueue("emmanuel");
    queue.enqueue("james");
    assertEquals("emmanuel", queue.dequeue());
    }
    @Test
    public void testWhenIEnqueue_X_Y_ZAndDequeueFrom_The_QueueTheFirstGuyLeaves(){
        queue.enqueue("emmanuel");
        queue.enqueue("james");
        queue.enqueue("emeka");
        assertEquals("emmanuel", queue.dequeue());
    }
    @Test
    public void testWhenIEnqueue_X_Y_Z_A_AndDequeueFrom_The_QueueTheFirstGuyLeaves(){
        queue.enqueue("emmanuel");
        queue.enqueue("james");
        queue.enqueue("emeka");
        queue.enqueue("david");
        assertEquals("emmanuel", queue.dequeue());
    }
    @Test
    public void testWhenIEnqueue_X_Y_Z_A_AndDequeueTwiceFrom_The_QueueTheFirstGuyLeaves(){
        queue.enqueue("emmanuel");
        queue.enqueue("james");
        queue.enqueue("emeka");
        queue.enqueue("david");
        queue.dequeue();
        assertEquals("james", queue.dequeue());
    }
    @Test
    public void testWhenIEnqueue_X_Y_Z_A_AndDequeueThreeTimesFrom_The_QueueTheFirstGuyLeaves(){
        queue.enqueue("emmanuel");
        queue.enqueue("james");
        queue.enqueue("emeka");
        queue.enqueue("david");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertEquals("david", queue.dequeue());
    }
    @Test
    public void testIfQueueIsFullNoOneCanEnter(){
        try {
            queue.enqueue("emmanuel");
            queue.enqueue("james");
            queue.enqueue("emeka");
            queue.enqueue("david");
            queue.enqueue("sultan");
            queue.enqueue("mike");
            queue.enqueue("mike");
            assertEquals("emmanuel",queue.dequeue());
        }catch (Exception exception) { // catch exception thrown in method1
            System.err.printf("%s%n%n", exception.getMessage());
            exception.printStackTrace();

    }


}
}
