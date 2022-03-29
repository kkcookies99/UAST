#include "FixedQueueTests.h"
#include "Data/FixedQueue.h"

namespace magpie
{
  void FixedQueueTests::runTests()
  {
    enqueueDequeue();
    serialEnqueue();
    multipleEnqueue();
    count();
    subscript();
  }

  void FixedQueueTests::enqueueDequeue()
  {
    FixedQueue<int, 3> queue;

    EXPECT_EQUAL(0, queue.count());
    EXPECT_EQUAL(3, queue.capacity());

    queue.enqueue(2);

    EXPECT_EQUAL(1, queue.count());
    EXPECT_EQUAL(2, queue[0]);

    int result = queue.dequeue();

    EXPECT_EQUAL(0, queue.count());
    EXPECT_EQUAL(2, result);
  }

  void FixedQueueTests::serialEnqueue()
  {
    FixedQueue<int, 3> queue;

    for (int i = 0; i < 6; i++)
    {
      EXPECT_EQUAL(0, queue.count());

      queue.enqueue(i);
      int result = queue.dequeue();

      EXPECT_EQUAL(i, result);
    }
  }

  void FixedQueueTests::multipleEnqueue()
  {
    FixedQueue<int, 3> queue;

    queue.enqueue(5);
    queue.enqueue(6);

    EXPECT_EQUAL(2, queue.count());
    EXPECT_EQUAL(5, queue.dequeue());
    EXPECT_EQUAL(1, queue.count());
    EXPECT_EQUAL(6, queue.dequeue());
    EXPECT_EQUAL(0, queue.count());

    queue.enqueue(7);
    queue.enqueue(8);

    EXPECT_EQUAL(2, queue.count());
    EXPECT_EQUAL(7, queue.dequeue());
    EXPECT_EQUAL(1, queue.count());
    EXPECT_EQUAL(8, queue.dequeue());
    EXPECT_EQUAL(0, queue.count());
  }

  void FixedQueueTests::count()
  {
    FixedQueue<int, 3> queue;

    EXPECT_EQUAL(0, queue.count());
    queue.enqueue(1);
    EXPECT_EQUAL(1, queue.count());
    queue.enqueue(1);
    EXPECT_EQUAL(2, queue.count());
    queue.enqueue(1);
    EXPECT_EQUAL(3, queue.count());
    queue.dequeue();
    EXPECT_EQUAL(2, queue.count());
    queue.enqueue(1);
    EXPECT_EQUAL(3, queue.count());
    queue.dequeue();
    EXPECT_EQUAL(2, queue.count());
    queue.dequeue();
    EXPECT_EQUAL(1, queue.count());
    queue.dequeue();
    EXPECT_EQUAL(0, queue.count());
  }

  void FixedQueueTests::subscript()
  {
    FixedQueue<int, 3> queue;

    queue.enqueue(5);
    queue.enqueue(6);

    EXPECT_EQUAL(5, queue[0]);
    EXPECT_EQUAL(6, queue[1]);

    queue.dequeue();

    EXPECT_EQUAL(6, queue[0]);

    queue.enqueue(7);
    queue.enqueue(8);

    EXPECT_EQUAL(6, queue[0]);
    EXPECT_EQUAL(7, queue[1]);
    EXPECT_EQUAL(8, queue[2]);
  }
}

