# iptables Limitations

Traditional Kubernetes networking commonly relies on:
- iptables-based packet forwarding.

As environments scale:
- rule complexity increases significantly.

---

# Why Limitations Matter

Large traffic volumes create:
- increased packet traversal
- rule-processing overhead
- and debugging complexity.

---

# Operational Challenges

iptables-heavy networking may create:
- latency overhead
- observability limitations
- and runtime troubleshooting difficulty.

---

# Runtime Visibility

Traditional networking provides:
- limited kernel-level traffic visibility.

This makes:
- distributed communication debugging harder.

---

# Platform Engineering Perspective

Modern Kubernetes networking increasingly requires:
- traffic visibility
- and runtime observability.

---

# Key Insight

Scaling distributed traffic increases iptables complexity significantly.
