import java.util.Scanner;

// Định nghĩa lớp Node cho một node trong danh sách liên kết đơn
class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

public class java_4 {
    // Hàm con để thêm một phần tử vào danh sách liên kết đơn
    static void insertNode(Node first, int value) {
        Node newNode = new Node(value);
        newNode.next = first.next;
        first.next = newNode;
    }

    // Hàm con để xóa tất cả các phần tử có giá trị bằng x và trả về số lượng đã xóa
    static int deleteNodesWithValue(Node first, int x) {
        int deletedCount = 0;

        while (first.next != null && first.next.data == x) {
            Node temp = first.next;
            first.next = temp.next;
            temp = null;
            deletedCount++;
        }

        Node current = first.next;
        while (current != null && current.next != null) {
            if (current.next.data == x) {
                Node temp = current.next;
                current.next = temp.next;
                temp = null;
                deletedCount++;
            } else {
                current = current.next;
            }
        }

        return deletedCount;
    }

    // Hàm con để in danh sách liên kết đơn
    static void printList(Node first) {
        while (first != null) {
            System.out.print(first.data + " ");
            first = first.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node first = new Node(0); // Khởi tạo danh sách liên kết đơn

        // Nhập số lượng phần tử trong danh sách
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Nhập các phần tử và thêm vào danh sách

        for (int i = 0; i < n; ++i) {
            int value = scanner.nextInt();
            insertNode(first, value);
        }

        // Nhập giá trị cần xóa
        int x = scanner.nextInt();

        // Xóa các phần tử có giá trị bằng x và in danh sách còn lại
        deleteNodesWithValue(first, x);
        printList(first.next);

        scanner.close();
    }
}
