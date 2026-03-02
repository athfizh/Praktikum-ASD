<div align="center">

```
 █████╗ ███████╗██████╗ 
██╔══██╗██╔════╝██╔══██╗
███████║███████╗██║  ██║
██╔══██║╚════██║██║  ██║
██║  ██║███████║██████╔╝
╚═╝  ╚═╝╚══════╝╚═════╝ 

Algoritma & Struktur Data
```

# 🧩 Praktikum ASD

### *Algorithm & Data Structure — Semester Repository*

<br/>

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Algorithm](https://img.shields.io/badge/Algorithm-Design-007396?style=for-the-badge&logo=openjdk&logoColor=white)
![Data Structure](https://img.shields.io/badge/Data_Structure-Core-e11d48?style=for-the-badge&logo=openjdk&logoColor=white)

<br/>

> *"An algorithm must be seen to be believed."*
> — Donald E. Knuth

<br/>

[![GitHub commits](https://img.shields.io/github/commit-activity/m/athfizh/Praktikum-ASD?style=flat-square&color=ED8B00&label=Commits)](https://github.com/athfizh/Praktikum-ASD/commits)
[![GitHub repo size](https://img.shields.io/github/repo-size/athfizh/Praktikum-ASD?style=flat-square&color=34d399&label=Repo%20Size)](https://github.com/athfizh/Praktikum-ASD)
[![GitHub last commit](https://img.shields.io/github/last-commit/athfizh/Praktikum-ASD?style=flat-square&color=f472b6&label=Last%20Update)](https://github.com/athfizh/Praktikum-ASD)
![Language](https://img.shields.io/badge/Language-Java%20100%25-ED8B00?style=flat-square&logo=openjdk)

</div>

---

## 👤 Identitas Mahasiswa

| Field | Detail |
|-------|--------|
| **Nama** | Athaulla Hafizh |
| **Username GitHub** | [@athfizh](https://github.com/athfizh) |
| **Mata Kuliah** | Praktikum Algoritma dan Struktur Data (ASD) |
| **Bahasa Pemrograman** | ☕ Java (100%) |
| **Tools** | IntelliJ IDEA / NetBeans / VS Code |

---

## 📂 Struktur Repository

```
Praktikum-ASD/
│
├── 📁 Jobsheet1/           # Pengenalan Algoritma & Java
├── 📁 Jobsheet2/           # Array & Pengurutan Dasar
├── 📁 Jobsheet3/           # Linked List
├── 📁 Jobsheet5/           # Stack (Tumpukan)
├── 📁 Jobsheet6/           # Queue (Antrian)
├── 📁 Jobsheet7/           # Tree (Pohon)
├── 📁 Jobsheet9/           # Graph & Algoritma Graf
├── 📁 P1Jobsheet10/        # Jobsheet 10 — Percobaan 1
├── 📁 P2Jobsheet10/        # Jobsheet 10 — Percobaan 2
├── 📁 TugasJobsheet10/     # Tugas Mandiri Jobsheet 10
├── 📁 Jobsheet11/          # Hashing & Tabel Hash
├── 📁 Jobsheet12/          # Sorting Lanjutan
├── 📁 Pertemuan14/         # Materi & Tugas Pertemuan 14
├── 📁 Praktikum15/         # Jobsheet 15 — Materi Akhir
│
└── 📄 .gitignore
```

---

## 📋 Rekap Jobsheet Praktikum

| No | Folder | Topik Utama | Konsep Kunci | Status |
|----|--------|-------------|--------------|--------|
| 1 | `Jobsheet1` | Pengenalan Algoritma & Java | Pseudocode, Flowchart | ✅ |
| 2 | `Jobsheet2` | Array & Sorting Dasar | Bubble, Selection Sort | ✅ |
| 3 | `Jobsheet3` | Linked List | Single & Double LL | ✅ |
| 5 | `Jobsheet5` | Stack | LIFO, Push, Pop | ✅ |
| 6 | `Jobsheet6` | Queue | FIFO, Enqueue, Dequeue | ✅ |
| 7 | `Jobsheet7` | Tree | Binary Tree, Traversal | ✅ |
| 9 | `Jobsheet9` | Graph | BFS, DFS, Adjacency | ✅ |
| 10 | `P1/P2/TugasJobsheet10` | Searching | Linear & Binary Search | ✅ |
| 11 | `Jobsheet11` | Hashing | Hash Function, Collision | ✅ |
| 12 | `Jobsheet12` | Sorting Lanjutan | Merge Sort, Quick Sort | ✅ |
| 14 | `Pertemuan14` | Materi & Tugas | Review Komprehensif | ✅ |
| 15 | `Praktikum15` | Jobsheet Akhir | Integrasi Materi | ✅ |

---

## 🧠 Struktur Data yang Dipelajari

<div align="center">

```
┌─────────────────────────────────────────────────────────────────┐
│                    STRUKTUR DATA — PETA MATERI                  │
├─────────────────┬───────────────────────────────────────────────┤
│  📦 Array        │ Struktur data linear statis                   │
│  🔗 Linked List  │ Node berantai — single & double               │
│  📚 Stack        │ LIFO — Last In, First Out                     │
│  🚶 Queue        │ FIFO — First In, First Out                    │
│  🌳 Tree         │ Hierarki — Binary Tree, BST                   │
│  🕸️  Graph        │ Node & Edge — BFS, DFS                        │
│  #️⃣  Hashing      │ Key-Value mapping, collision handling         │
└─────────────────┴───────────────────────────────────────────────┘
```

</div>

---

## 💡 Contoh Implementasi Struktur Data

### 🔗 Linked List
```java
class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; this.next = null; }
}

class LinkedList {
    Node head;

    void tambah(int data) {
        Node baru = new Node(data);
        if (head == null) { head = baru; return; }
        Node curr = head;
        while (curr.next != null) curr = curr.next;
        curr.next = baru;
    }
}
```

### 📚 Stack (Tumpukan)
```java
class Stack {
    int[] data = new int[100];
    int top = -1;

    void push(int val) { data[++top] = val; }
    int  pop()         { return data[top--]; }
    int  peek()        { return data[top]; }
    boolean isEmpty()  { return top == -1; }
}
```

### 🚶 Queue (Antrian)
```java
class Queue {
    int[] data = new int[100];
    int front = 0, rear = -1, size = 0;

    void enqueue(int val) { data[++rear] = val; size++; }
    int  dequeue()        { size--; return data[front++]; }
    boolean isEmpty()     { return size == 0; }
}
```

### 🌳 Binary Tree & Traversal
```java
class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int data) { this.data = data; }
}

class BinaryTree {
    TreeNode root;

    // Inorder: Left → Root → Right
    void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
}
```

### 🕸️ Graph — BFS
```java
void BFS(int start) {
    boolean[] visited = new boolean[V];
    Queue<Integer> queue = new LinkedList<>();
    visited[start] = true;
    queue.add(start);

    while (!queue.isEmpty()) {
        int node = queue.poll();
        System.out.print(node + " ");
        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                queue.add(neighbor);
            }
        }
    }
}
```

---

## 🔢 Algoritma Pengurutan (Sorting)

| Algoritma | Best Case | Worst Case | Space | Stabil |
|-----------|-----------|------------|-------|--------|
| **Bubble Sort** | O(n) | O(n²) | O(1) | ✅ |
| **Selection Sort** | O(n²) | O(n²) | O(1) | ❌ |
| **Insertion Sort** | O(n) | O(n²) | O(1) | ✅ |
| **Merge Sort** | O(n log n) | O(n log n) | O(n) | ✅ |
| **Quick Sort** | O(n log n) | O(n²) | O(log n) | ❌ |

```java
// Merge Sort — Divide & Conquer
void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
}
```

---

## 🔍 Algoritma Pencarian (Searching)

```java
// Binary Search — O(log n)
int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
        int mid = (left + right) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return -1; // tidak ditemukan
}
```

---

## 🚀 Cara Menjalankan Project

```bash
# Pastikan Java terinstall
java -version

# Masuk ke folder jobsheet yang diinginkan
cd Praktikum-ASD/Jobsheet3

# Compile semua file Java
javac *.java

# Jalankan program utama
java Main
```

### Di IntelliJ IDEA / NetBeans
```
1. File → Open → Pilih folder Jobsheet yang diinginkan
2. Klik kanan pada file Main.java
3. Pilih "Run 'Main'"
4. Lihat output di konsol / terminal
```

---

## 🎯 Capaian Pembelajaran

- [x] Memahami konsep dasar **Algoritma** dan kompleksitas waktu (Big-O)
- [x] Mengimplementasikan **Array** satu dan multidimensi di Java
- [x] Membangun **Linked List** (single & double) dari nol
- [x] Menerapkan **Stack** untuk evaluasi ekspresi & backtracking
- [x] Mengimplementasikan **Queue** untuk simulasi antrian
- [x] Membangun dan traversal **Binary Tree** (Inorder, Preorder, Postorder)
- [x] Mengimplementasikan **Graph** dengan BFS dan DFS
- [x] Memahami dan menerapkan **Algoritma Sorting** (Bubble, Merge, Quick Sort)
- [x] Menguasai **Binary Search** dan Linear Search
- [x] Memahami konsep **Hashing** dan penanganan collision

---

## 📊 Statistik Bahasa

<div align="center">

```
Java  ████████████████████████████████████████  100%
```

*100% Java — Algoritma Murni, Logika Kuat ☕*

</div>

---

## 📬 Kontak

<div align="center">

**Athaulla Hafizh**

[![GitHub](https://img.shields.io/badge/GitHub-athfizh-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/athfizh)

</div>

---

<div align="center">

<sub>🧩 Repository ini merupakan dokumentasi perjalanan belajar <b>Algoritma dan Struktur Data</b></sub>

<br/>

<sub>Made with ☕ Java & 🧠 Logic by <b>Athaulla Hafizh</b></sub>

</div>
